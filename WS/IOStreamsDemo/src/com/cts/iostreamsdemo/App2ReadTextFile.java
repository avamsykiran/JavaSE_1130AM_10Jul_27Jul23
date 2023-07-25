package com.cts.iostreamsdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App2ReadTextFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter File Name: ");
		String fileName = scan.next();

		Path filePath = Paths.get(fileName);

		try {
			List<String> lines = Files.readAllLines(filePath);
			lines.stream().forEach(System.out::println);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		scan.close();

	}

}
