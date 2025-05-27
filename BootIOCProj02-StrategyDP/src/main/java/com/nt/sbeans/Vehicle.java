//Vehicle.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	@Autowired
	@Qualifier("motor")
	private  IEngine  engine;
	
	public  void  journey(String startPlace , String  endPlace) {
		engine.startEngine();
		System.out.println("Journey Started at::"+startPlace);
		
		System.out.println("Journery is going on.....");
		
		engine.stopEngine();
		System.out.println("Journey Stopped at::"+endPlace);
			
	}
}
