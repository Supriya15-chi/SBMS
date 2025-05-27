package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component("ds")
//@Data
@Getter
public class DiagnosticServices {
	@Value("${ds.xrayRate}")
	private  Float xrayPrice;
	@Value("${ds.bpRate}")
	private  Float bpPrice;
	@Value("${ds.twoDRate}")
	private  Float  twoDechoPrice;
	@Value("${ds.diabeticRate}")
	private  Float  diabeticTestPrice;
	@Value("${ds.mriRate}")
	private   Float  mriPrice;
	@Value("${ds.ctscanRate}")
	private   Float  ctscanPrice;
	
	//toString() (alt+shift+s,s)
	@Override
	public String toString() {
		return "DiagnosticServices [xrayPrice=" + xrayPrice + ", bpPrice=" + bpPrice + ", twoDechoPrice="
				+ twoDechoPrice + ", diabeticTestPrice=" + diabeticTestPrice + ", mriPrice=" + mriPrice
				+ ", ctscanPrice=" + ctscanPrice + "]";
	}
	

}
