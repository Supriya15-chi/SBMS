package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// this  class implementing common interface is for rule2
//taking the class as final  is strategyDP rule no:3
@Component("dtdc")
//@Primary
@Lazy(true)
public final class DTDC implements ICourier  {
	
	
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid+" order id order  items  ready to deliver using  DTDC  Courier Service";
	}

}
