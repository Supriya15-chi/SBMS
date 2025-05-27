package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonDetails;
import com.nt.sbeans.TestBean;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext  ctx=
				      new AnnotationConfigApplicationContext(AppConfig.class);
		//get Spring Bean class obj ref 
		PersonDetails  details=ctx.getBean("pDetails",PersonDetails.class);
		System.out.println(details);
		
		System.out.println("==============================");
		Environment  env=ctx.getEnvironment();
		System.out.println("Env object class name ::"+env.getClass());
		System.out.println(" per.name key value ::"+env.getProperty("per.name"));
		System.out.println(" os.name(system) key value ::"+env.getProperty("os.name"));
		System.out.println("=============================");
		TestBean  tb=ctx.getBean("tb",TestBean.class);
		System.out.println("data is ::"+tb.displayData());
		
		
		//close the container
		
		ctx.close();

	}

}
