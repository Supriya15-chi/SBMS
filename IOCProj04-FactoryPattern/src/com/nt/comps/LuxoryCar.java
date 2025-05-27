package com.nt.comps;

public class LuxoryCar implements ICar {
	
	public LuxoryCar() {
		System.out.println("LuxoryCar:: 0-param constructor");
	}

	@Override
	public String drive() {
		
		return "Driving  Luxory Car  BMW";
	}

}
