package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
        //create  IOC container
		AnnotationConfigApplicationContext  ctx=
				 new AnnotationConfigApplicationContext(AppConfig.class);
		//get  target spring bean class obj ref
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
  
		//invoke b.method
		String msg=fpkt.shopping(new String[] {"shirt","trouser","kite","manza"},
				                                        new double[] {3000.0,4000.0,400.0,300.0});
		
		System.out.println(msg);
    //close the IOC container
		  ctx.close();
		
	}

}
