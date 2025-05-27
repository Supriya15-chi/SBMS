package com.nt.factory;

import com.nt.comps.ICar;
import com.nt.comps.LuxoryCar;
import com.nt.comps.MUVCar;
import com.nt.comps.OffRoadingCar;
import com.nt.comps.StandardCar;

//factory  pattern class
public class CarFactory {
	
	//static  factory  method having  factory pattern logic
	public    static  ICar   getInstance(String  carType) {
		   ICar  car=null;
		   if(carType.equalsIgnoreCase("standard"))
			   car=new StandardCar();
		   else if(carType.equalsIgnoreCase("muv"))
			   car=new MUVCar();
		   else if(carType.equalsIgnoreCase("offroading"))
			   car=new OffRoadingCar();
		   else if(carType.equalsIgnoreCase("luxory"))
			   car=new LuxoryCar();
		   else 
			   throw new IllegalArgumentException("invalid car type");
		   
		   return  car;
	}

}
