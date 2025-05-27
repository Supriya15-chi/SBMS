//Client App
package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.controller.PayrollMgmtOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProj11MiniProjectRealtimeDiApplication {

	public static void main(String[] args) {
		  //create   SpringApplication class obj
	   SpringApplication application=new SpringApplication(BootIocProj11MiniProjectRealtimeDiApplication.class);
	    application.setAdditionalProfiles("dev");	   
		try(//get  access to IOC contaner
		 	ConfigurableApplicationContext ctx=application.run(args);
			   //get Scanner class object
				Scanner sc=new Scanner(System.in);
				){
		// get Controller Spring bean class obj ref
		PayrollMgmtOperationsController  controller=ctx.getBean("payroll-controller",PayrollMgmtOperationsController.class);
		
		// read inputs from the enduser
		System.out.println("Enter Desg1 ::");
		String desg1=sc.next();
		
		System.out.println("Enter Desg2 ::");
		String desg2=sc.next();
		
		
		System.out.println("Enter Desg3 ::");
		String desg3=sc.next();
		
		
		//invoke the b.methods
			List<Employee>  list=controller.showEmployeesByDesgs(desg1,desg2,desg3);
			//display  result
			System.out.println("Employees belonging to  "+desg1+"  "+desg2+"  "+desg3+" are ");
			list.forEach(emp->{
				System.out.println(emp);
			});
			System.out.println("------------------");
			 // Active prfiles are
	    Environment  env=ctx.getEnvironment();
	    System.out.println("Current active Env is ::"+Arrays.toString(env.getActiveProfiles()));
	  
		}//try
		catch(Exception e) {
			System.out.println("Internal Problem ::"+e.getMessage());
			e.printStackTrace();
		}
		
	}//main

}//class
