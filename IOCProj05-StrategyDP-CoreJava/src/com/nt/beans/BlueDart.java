package com.nt.beans;
// this  class implementing common interface is for rule2
//taking the class as final  is strategyDP rule no:3
public final class BlueDart implements ICourier {
	
	
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return oid+"  order id  order   items  ready to deliver using  BlueDart  Courier Service";
	}

}
