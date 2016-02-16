package com.fmdp.test;

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
			System.out.println("======================================== New Class Added =============");	
			 GujratPlantFactory obje = new  GujratPlantFactory();
			 System.out.println("  sdf "+obje.showBranch1AddedClas());
			
	}
}
