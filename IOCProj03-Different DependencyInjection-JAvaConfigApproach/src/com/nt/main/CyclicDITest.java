package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.A;

public class CyclicDITest {

	public static void main(String[] args) {
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=
				  new AnnotationConfigApplicationContext(AppConfig.class);
		//get  spring bean class obj ref
		A  a=ctx.getBean("a1",A.class);
		System.out.println(a);
		
		//close cotainer
		ctx.close();

	}

}
