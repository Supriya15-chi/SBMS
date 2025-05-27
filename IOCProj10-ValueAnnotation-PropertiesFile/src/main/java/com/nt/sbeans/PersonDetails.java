package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pDetails")
public class PersonDetails {
	  // injecting  the values from the proeprties file
	@Value("${per.id}")
	private  int  pid;
	@Value("${per.name}")
	private  String  pname;
	@Value("${per.addrs}")
	private  String  paddrs;
	@Value("${per.age}")
	private  Integer  page;
	//hard coding of the values
	@Value("raja@rani.com")
	private  String  email;
	//  injecting the system property values
	@Value("${os.name}")
	private  String  osName;
	@Value("${os.version}")
	private  String   osVersion;
	// injecting  env variable values
	@Value("${Path}")
	private  String   pathData;
		
	//toString()  (alt+shift+s,s)
	@Override
	public String toString() {
		return "PersonDetails [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", page=" + page + ", email="
				+ email + ", osName=" + osName + ", osVersion=" + osVersion + ", pathData=" + pathData + "]";
	}

	
	
	
	
	
	

}
