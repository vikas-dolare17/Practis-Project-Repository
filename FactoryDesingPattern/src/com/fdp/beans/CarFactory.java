package com.fdp.beans;

public class CarFactory {

	public static Car getCar(String name){
		
		switch (name){
		
		 case "alto":
			    return new Alto();
			    
		 case "hondai":
			 			return new Hondai();
			 			
			    
		}
		
		return null;
		
				
	}
}
