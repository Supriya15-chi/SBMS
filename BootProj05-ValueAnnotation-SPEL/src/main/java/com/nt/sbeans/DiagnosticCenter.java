package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component("dc")
@Data
public class DiagnosticCenter {
	@Value("3456")  //hard coding
	private  Integer id;
	  // injecting the values  collected from the properties file
	@Value("${dc.name}")
	private  String name;
	@Value("${dc.addrs}")
	private  String addrs;
	//injecting the system property values
	@Value("${user.name}")
	private  String  username;
	@Value("${os.name}")
	private   String   osName;
	//injecting env.. variable values
	@Value("${Path}")
	private  String   pathData;
	
	//SPEL based Arithmetic and Logical Operations
	@Value("#{ds.diabeticTestPrice + ds.bpPrice}")
	private Float  diabeticPackagePrice;
	@Value("#{ds.diabeticTestPrice + ds.bpPrice + ds.xrayPrice + ds.mriPrice+ ds.ctscanPrice + ds.twoDechoPrice}")
		private Float  fullBodyPackagePrice;
	@Value("#{ds.bpPrice + ds.twoDechoPrice}")
	private Float  heartPackagePrice;
	@Value("#{ds.ctscanPrice>10000 }")
	private  Boolean  isCtscanCostly;
	
	@Autowired  // spring bean injection
	private   DiagnosticServices  services;
	
	

}
