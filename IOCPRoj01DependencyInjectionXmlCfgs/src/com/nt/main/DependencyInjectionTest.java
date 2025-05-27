//DepedencyInjectionTest.java
package com.nt.main;

import java.time.LocalTime;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main() (start)");
		//create  the IOC container
		/*FileSystemXmlApplicationContext  ctx=
				     new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");*/
		/*	ClassPathXmlApplicationContext  ctx=
					           new  ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
			*/
		
		/*	FileSystemXmlApplicationContext  ctx=
				     new FileSystemXmlApplicationContext("E:\\Worskpaces\\Spring\\NTSPBMS717\\IOCPRoj01DependencyInjectionXmlCfgs\\src\\com\\nt\\cfgs\\applicationContext.xml");
			*/
		/*ClassPathXmlApplicationContext  ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("IOC container creation");
		
		//get Target spring Bean class object ref from the IOCcontainer
		Object obj=ctx.getBean("wmg");
		//type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		System.out.println("Gathering target spring bena class obj ref");
		//invoke the b.method
		String result=generator.generateWishMessage("raja");
		System.out.println(result);
		//close the IOC container
		ctx.close();*/
		
		ClassPathXmlApplicationContext  ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("IOC container creation");
		LocalTime  time1=ctx.getBean("java.time.LocalTime",LocalTime.class);
		LocalTime  time2=ctx.getBean("java.time.LocalTime#0",LocalTime.class);
		LocalTime  time3=ctx.getBean("java.time.LocalTime#1",LocalTime.class);
		System.out.println(time1+ "   "+time2+"   "+time3);
		 
		
		
		
		
		System.out.println("DependencyInjectionTest.main() (end)");
	}

}
