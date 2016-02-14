package com.fmdp.implimention;

import com.fmdp.interfaces.ICar;

public class Swift implements ICar{

	@Override
	public void carName() {
		System.out.println("  Swift  ............      ");
	}

	@Override
	public void assemble() {
		System.out.println(" Assembled..............");
	}

	@Override
	public void test() {
		System.out.println(" Ready to Launch...........");
	}

}
