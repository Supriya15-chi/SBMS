package com.nt.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.nt.beans")
public class AppConfig {
	
	 public AppConfig() {
		System.out.println("AppConfig:: 0-param construtor");
	}

}
