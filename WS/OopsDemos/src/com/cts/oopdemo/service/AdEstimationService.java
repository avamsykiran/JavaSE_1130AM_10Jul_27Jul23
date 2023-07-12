package com.cts.oopdemo.service;

import com.cts.oopdemo.model.AdBoard;

public class AdEstimationService {

	private double paintingRate;
	private double borderingRate;
	
	public AdEstimationService() {
		// TODO Auto-generated constructor stub
	}

	public AdEstimationService(double paintingRate, double borderingRate) {
		super();
		this.paintingRate = paintingRate;
		this.borderingRate = borderingRate;
	}
	
	public double estiamtePaintingCost(AdBoard ad){
		return ad.area()*paintingRate;
	}
	
	public double estimateBorderingCost(AdBoard ad){
		return ad.perimeter()*borderingRate;
	}
}
