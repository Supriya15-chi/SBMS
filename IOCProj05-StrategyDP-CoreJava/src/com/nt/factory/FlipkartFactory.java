package com.nt.factory;

import com.nt.beans.BlueDart;
import com.nt.beans.DTDC;
import com.nt.beans.Flipkart;
import com.nt.beans.ICourier;
//Factory class
public class FlipkartFactory {

	  // static factory method creating and returning  Flipkart classs obj
	public static   Flipkart  getInstance(String courierType) {
		//create  Dependent class object
		ICourier  courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("blueDart"))
			courier=new BlueDart();
		else 
			throw new IllegalArgumentException("invalid Courier Type");
		//create  Target class object
		Flipkart fpkt=new Flipkart();
		 //assign  dependent classs object to target class object
		fpkt.setCourier(courier);
		return  fpkt;
	}
}
