package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIocProj01DependencyInjectionApplication {
	
	@Bean(name="ld")
	public  LocalDate  createDate() {
		System.out.println("BootIocProj01DependencyInjectionApplication.createDate()");
		return  LocalDate.now();
	}

	public static void main(String[] args) {
		//Access the  IOC container obj ref
		ApplicationContext ctx=SpringApplication.run(BootIocProj01DependencyInjectionApplication.class, args);
		System.out.println(" IOC container class name ::"+ctx.getClass().getName());
		// get  Target spring bean  class object  ref
		SeasonFinder  sf=ctx.getBean("sf",SeasonFinder.class);
		//invoke the b.method
		String msg=sf.findSeason();
		System.out.println("result is ::"+msg);
		
		// close the  IOC container
		  ((ConfigurableApplicationContext) ctx).close();
		
	}

}
