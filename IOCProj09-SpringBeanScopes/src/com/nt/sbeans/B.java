package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("b1")
public class B {
  private  A  a;
  
  
  public B(A  a) {
	  System.out.println("B:: 1 -param constructor");
	  this.a=a;
	}
  
	/*@Autowired
	public   void setA(A a) {
	  System.out.println("B.setA()");
	  this.a=a;
	}*/
  
  //toString()
  public  String  toString() {
	  return  "a=";
  }
}
