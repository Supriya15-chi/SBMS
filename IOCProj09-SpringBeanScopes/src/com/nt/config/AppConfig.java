//AppConfig.java
package com.nt.config;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nt.ston.Printer;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	
	
	//@Bean(name="ltime")
	@Bean
	public    LocalTime createLTime() {
		System.out.println("AppConfig.createLTime()");
		return  LocalTime.now();
	}
	
	@Bean(name="ld")
	//@Bean
	@Scope("singleton")
	public   LocalDate  createLDate() {
		System.out.println("AppConfig.createLDate()");
		return LocalDate.now();
	}
	
	@Bean(name="dt1")
	//@Bean
	@Scope("singleton")
	public   Date  createDate1() {
		System.out.println("AppConfig.createLDate1()");
		return new Date();
	}
	
	@Bean(name="dt2")
	//@Bean
	@Scope("singleton")
	public   Date  createDate2() {
		System.out.println("AppConfig.createLDate2()");
		return new Date();
	}
	
	@Bean(name="prn1")
	public  Printer  createPrn1() {
		return   Printer.getInstance();
	}
	
/*	@Bean(name="prn2")
	public  Printer  createPrn2() {
		return   Printer.getInstance();
	}
	*/

}
