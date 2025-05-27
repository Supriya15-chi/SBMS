package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// this  class implementing common interface is for rule2
//taking the class as final  is strategyDP rule no:3
@Component("dhl")
//@Primary
public final class DHL implements ICourier  {
	
	
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return oid+" order id order  items  ready to deliver using  DHL  Courier Service";
	}

}
