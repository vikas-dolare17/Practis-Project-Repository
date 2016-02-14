package com.fmdp.dplogic;

import com.fmdp.implimention.Indigo;
import com.fmdp.interfaces.ICar;

public class GujratPlantFactory extends TataMotorsWorkshopFactory{

	public ICar create(String carname) {
		
		switch (carname){
		 
		case "indigo" :
			
		case "Indigo" :
						return new Indigo();
		}
		return null;
	}
	

}
