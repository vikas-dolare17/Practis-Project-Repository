package com.fmdp.dplogic;

import com.fmdp.implimention.Swift;
import com.fmdp.implimention.Wagnor;
import com.fmdp.interfaces.ICar;

public class PunePlantFactory extends TataMotorsWorkshopFactory {
	
	@Override
	public ICar create(String carname) {
			
			switch (carname){
			
				case "swift":
						 	return new Swift();
						 
				case "wagnor":
							return new Wagnor();
			}			  
		
		return null;
	}
	

}



