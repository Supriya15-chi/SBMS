package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("a1")
public class A {
	private  B b;
	
	
	public A(B  b) {
		System.out.println("A::1 -param consructor");
		this.b=b;
	}
	
	/*@Autowired
	public void setB(B b) {
		System.out.println("A.setB()");
		this.b=b;
	}
	*/
	//toString()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "B=";
	}

}
