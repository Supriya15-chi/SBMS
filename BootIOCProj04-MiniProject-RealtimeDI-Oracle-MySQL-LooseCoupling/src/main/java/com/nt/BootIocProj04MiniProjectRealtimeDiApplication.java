package com.nt;

import java.io.Closeable;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties.ShowSummaryOutput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.PayrollMgmtOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj04MiniProjectRealtimeDiApplication {

	public static void main(String[] args) {
		//get  access to IOC contaner
		ApplicationContext ctx=SpringApplication.run(BootIocProj04MiniProjectRealtimeDiApplication.class, args);
		// get Controller Spring bean class obj ref
		PayrollMgmtOperationsController  controller=ctx.getBean("payroll-controller",PayrollMgmtOperationsController.class);
		
		// read inputs from the enduser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Desg1 ::");
		String desg1=sc.next();
		
		System.out.println("Enter Desg2 ::");
		String desg2=sc.next();
		
		
		System.out.println("Enter Desg3 ::");
		String desg3=sc.next();
		
		
		
		//invoke the b.methods
		try {
			List<Employee>  list=controller.showEmployeesByDesgs(desg1,desg2,desg3);
			//display  result
			System.out.println("Employees belonging to  "+desg1+"  "+desg2+"  "+desg3+" are ");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}
		catch(Exception e) {
			System.out.println("Internal problem::"+e.getMessage());
			e.printStackTrace();
		}
		
		//close the  IOC container
		 ( (ConfigurableApplicationContext) ctx).close();
		
	}

}
