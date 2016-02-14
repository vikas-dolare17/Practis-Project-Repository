package com.fmdp.test;

import java.security.GuardedObject;

import com.fmdp.dplogic.GujratPlantFactory;
import com.fmdp.dplogic.PunePlantFactory;
import com.fmdp.dplogic.TataMotorsWorkshopFactory;
import com.fmdp.interfaces.ICar;

public class PMTFTest {

	public static void main(String args[]){
		
		
		TataMotorsWorkshopFactory tata = null;
		ICar car = null;
		
		tata = new PunePlantFactory();
	    car = tata.buildCar("wagnor");
		
			car.carName();
			car.assemble();
			car.test();
		
		System.out.println("========================================");
		
		 tata  = new GujratPlantFactory();
		
		  car = tata.buildCar("indigo");
		
			car.carName();
			car.assemble();
			car.test();
	}
}
