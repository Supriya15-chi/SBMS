package com.nt.main;

import com.nt.comps.ICar;
import com.nt.factory.CarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		//  use Factory
		ICar car=CarFactory.getInstance("standard");
	    System.out.println(car.drive());
	    System.out.println("---------------------------");
	    
	    ICar car1=CarFactory.getInstance("luxory");
	    System.out.println(car1.drive());
	    

	}

}
