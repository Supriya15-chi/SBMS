package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj07YmlFileApplication {

	public static void main(String[] args) {
		//get IOC container
		try(ConfigurableApplicationContext ctx=SpringApplication.run(BootProj07YmlFileApplication.class, args);){
		// invoke the b.method
		Employee  emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
