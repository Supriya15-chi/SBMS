//DependencyInjectionTest.java
package com.nt.main;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=
				   new AnnotationConfigApplicationContext(AppConfig.class);
		//get Target spring bean class obj ref
		WishMessageGenerator  generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String msg=generator.generateWishMessage("raja");
		System.out.println(msg);
		System.out.println("----------------------");
		LocalTime  time=ctx.getBean("ltime",LocalTime.class);
		LocalDate  date=ctx.getBean("ldate",LocalDate.class);
		System.out.println(time+"    "+date);
		
		//close  IOC container
		ctx.close();

	}

}
