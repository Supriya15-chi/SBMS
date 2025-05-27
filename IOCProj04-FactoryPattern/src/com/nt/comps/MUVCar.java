package com.nt.comps;

public class MUVCar implements ICar {
	
	public MUVCar() {
		System.out.println("MUVCar::  0-param consructor");
	}

	@Override
	public String drive() {
		
		return "Driving  MUV Car Innova Crysta";
	}

}
