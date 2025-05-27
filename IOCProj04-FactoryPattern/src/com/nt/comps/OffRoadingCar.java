package com.nt.comps;

public class OffRoadingCar implements ICar {
	
	public OffRoadingCar() {
		System.out.println("OffRoadingCar:: 0-param consructor");
	}

	@Override
	public String drive() {
		
		return "Driving  OffRoading Mahindar Thar";
	}

}
