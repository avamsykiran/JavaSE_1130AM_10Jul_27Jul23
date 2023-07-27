package com.cts.hrapp.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.hrapp.exception.DataOperationFailedException;
import com.cts.hrapp.model.Employee;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	public static final String ADD_EMP_QRY = "insert into emps(fnm,sal,isc,jdt) values(?,?,?,?)";
	public static final String GET_EMP_ID_QRY = "select max(eid) from emps";
	public static final String DEL_EMP_QRY = "delete from emps where eid=?";
	public static final String GET_EMP_BY_ID_QRY = "select eid,fnm,sal,isc,jdt from emps where eid=?";
	public static final String GET_ALL_EMPS_QRY = "select eid,fnm,sal,isc,jdt from emps";

	private ConnectionProvider connectionProvider;

	public EmployeeDaoJdbcImpl() throws DataOperationFailedException {
		try {
			this.connectionProvider = ConnectionProvider.getInstance();
		} catch (IOException | ClassNotFoundException e) {
			throw new DataOperationFailedException("Unable to read the database connection proeprties! \nTechErr"+e.getMessage());
		}
	}

	@Override
	public Employee add(Employee employee) throws DataOperationFailedException {
		try (Connection con = connectionProvider.getConnection();
				PreparedStatement psIns = con.prepareStatement(ADD_EMP_QRY);
				PreparedStatement psId = con.prepareStatement(GET_EMP_ID_QRY);) {

			psIns.setString(1, employee.getFullName());
			psIns.setDouble(2, employee.getSalary());
			psIns.setBoolean(3, employee.isContract());
			psIns.setDate(4, Date.valueOf(employee.getJoinDate()));

			psIns.executeUpdate();

			ResultSet rs = psId.executeQuery();
			if (rs.next()) {
				employee.setEmpId(rs.getInt(1));
			}

		} catch (SQLException e) {
			throw new DataOperationFailedException("Employee could not be added! \n TechErr: " + e.getMessage());
		}
		return employee;
	}

	@Override
	public void deleteById(int empId) throws DataOperationFailedException {
		try (Connection con = connectionProvider.getConnection();
				PreparedStatement psDel = con.prepareStatement(DEL_EMP_QRY);) {

			psDel.setInt(1, empId);
			psDel.executeUpdate();

		} catch (SQLException e) {
			throw new DataOperationFailedException("Employee could not be deleted! \n TechErr: " + e.getMessage());
		}

	}

	@Override
	public Employee getById(int empId) throws DataOperationFailedException {
		Employee emp = null;

		try (Connection con = connectionProvider.getConnection();
				PreparedStatement psSel = con.prepareStatement(GET_EMP_BY_ID_QRY);) {

			psSel.setInt(1, empId);

			ResultSet rs = psSel.executeQuery();
			if (rs.next()) {
				emp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getBoolean(4),
						rs.getDate(5).toLocalDate());
			}

		} catch (SQLException e) {
			throw new DataOperationFailedException("Employee can not be retrived! \n TechErr: " + e.getMessage());
		}
		return emp;
	}

	@Override
	public List<Employee> getAll() throws DataOperationFailedException {
		List<Employee> emps = new ArrayList<>();
		try (Connection con = connectionProvider.getConnection();
				PreparedStatement psSel = con.prepareStatement(GET_ALL_EMPS_QRY);) {

			ResultSet rs = psSel.executeQuery();
			while (rs.next()) {
				emps.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getBoolean(4),
						rs.getDate(5).toLocalDate()));
			}

		} catch (SQLException e) {
			throw new DataOperationFailedException("Employee can not be retrived! \n TechErr: " + e.getMessage());
		}

		return emps;
	}

}
