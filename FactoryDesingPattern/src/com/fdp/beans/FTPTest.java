package com.fdp.beans;

public class FTPTest {

	public static void main(String args[]){
		
		Car car = null;
		
		car = CarFactory.getCar("alto");
			System.out.println(car.carName());
			System.out.println(car.carColor());
			System.out.println(car.carEngine());
			System.out.println(car.carStaring());
		
		System.out.println("===========================================");
		
		car = CarFactory.getCar("hondai");
			System.out.println(car.carName());
			System.out.println(car.carColor());
			System.out.println(car.carEngine());
			System.out.println(car.carStaring());
			
	}
}
