package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@ConfigurationProperties(prefix = "emp.info")
@Data
public class Employee {
	private  Integer  id;
	private   String  name;
	private   String addrs;
	private   String qualification;
	private   Long mobileNo;

}
