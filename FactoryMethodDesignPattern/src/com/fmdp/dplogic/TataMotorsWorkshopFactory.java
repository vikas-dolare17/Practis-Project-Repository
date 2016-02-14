package com.fmdp.dplogic;

import com.fmdp.interfaces.ICar;

abstract public class TataMotorsWorkshopFactory {

	public  ICar buildCar(String carname){
		ICar car = null;
		
			car = create(carname);
		
		return car;
		
	}
	
	
	abstract public ICar create(String carname);
	
}
