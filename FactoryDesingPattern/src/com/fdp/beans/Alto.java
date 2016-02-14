package com.fdp.beans;

public class Alto implements Car{

	@Override
	public String carName() {
		return "Car Name : Indica";
	}

	@Override
	public String carColor() {
		return "Car Color : White";
	}

	@Override
	public String carEngine() {
		return "Car Engine : 280cc";
	}

	@Override
	public String carStaring() {
		return "Car Stairing : Non-Power Stairing";
	}
	

}
