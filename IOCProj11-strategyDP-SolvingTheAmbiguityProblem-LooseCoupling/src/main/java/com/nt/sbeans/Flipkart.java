package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//  taking the class as final  is strategyDP rule no:3
@Component("fpkt")
public final class Flipkart {
	@Autowired  //Field Injection
	
	//@Qualifier("${courier.id}")  Error -- place holder can be only in @Value annotation
	//@Qualifier(@Value("${courier.id}"))  Error -- @Value annotation can not be placed inside  the @Qualifer(-) annotation
	/*@Value("${courier.id}")
	private String  id;
	@Qualifier(id) //Error -- variable names can not be passed in  the @Qualifer annotation .. it just allows "String" constant*/
	@Qualifier("transporter")
	private  ICourier  courier;  //HAS-A property   (strategyDP rule no:1,2)
	
	public Flipkart() {
		System.out.println("Flipkar:: 0-param  construtor");	
		}
	
	// business method
	public  String  shopping(String items[], double  prices[]) {
		System.out.println("Flipkart.shopping()");
		//calcaulate the bill amount
		double billAmt=0.0;
		for(double p:prices)
			billAmt=billAmt+p;
		
	   //generate the order id
	    int oid=new Random().nextInt(1000);
	   //deliver  items
	String  msg=courier.deliver(oid);
	   // send final  message
	return   Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+" bill amount::"+billAmt+"..."+msg;
	}
}
