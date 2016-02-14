package com.fmdp.implimention;

import com.fmdp.interfaces.ICar;

public class Indigo implements ICar {

	@Override
	public void carName() {
		System.out.println(" Indigo...........");
	}

	@Override
	public void assemble() {
		System.out.println(" assembled............");
	}

	@Override
	public void test() {
		System.out.println(" Ready to Launched..........");
	}

}
