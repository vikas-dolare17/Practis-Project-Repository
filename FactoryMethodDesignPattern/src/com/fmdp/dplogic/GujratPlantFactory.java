package com.fmdp.dplogic;

import com.fmdp.implimention.Indigo;
import com.fmdp.interfaces.ICar;
// Factory TataMotorsWorkshopFactory extends with GujratPlantFactory.....
import com.fmdp.test.ClassAddedForBranch1;

public class GujratPlantFactory extends TataMotorsWorkshopFactory{
	
	public String showBranch1AddedClas(){
		
		ClassAddedForBranch1 obj = new ClassAddedForBranch1();
		System.out.println("ClassAddedForBranch1"+obj);
		return "ClassAddedForBranch1";
		
	}

	public ICar create(String carname) {
		
		switch (carname){
		 
		case "indigo" :
			
		case "Indigo" :
						return new Indigo();
		}
		return null;
	}
	

}
