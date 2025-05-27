package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.nt.sbeans.DiagnosticCenter;
import com.nt.sbeans.DiagnosticServices;

@SpringBootApplication
@PropertySource("com/nt/commons/Info.properties")
public class BootProj05ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		//get  Access to IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj05ValueAnnotationSpelApplication.class, args);
		/*// get access to Spring bean class obj ref
		DiagnosticCenter   dc=ctx.getBean("dc",DiagnosticCenter.class);
		System.out.println(dc);
		
		System.out.println("==========================");
		Environment  env=ctx.getEnvironment();
		System.out.println("Env object class name::"+env.getClass());
		System.out.println("os.name  key value::"+env.getProperty("os.name"));
		System.out.println(" dc.name key value ::"+env.getProperty("dc.name"));
		*/
		
		DiagnosticServices   ds=ctx.getBean("ds",DiagnosticServices.class);
		System.out.println(ds);
		
		// close the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
