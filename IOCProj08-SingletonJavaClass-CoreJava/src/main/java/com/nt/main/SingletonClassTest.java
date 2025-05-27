package com.nt.main;

import com.nt.ston.Printer;

public class SingletonClassTest {

	public static void main(String[] args) {
		  Printer prn1=Printer.getInstance();
	      Printer prn2=Printer.getInstance();
	        System.out.println(prn1.hashCode()+"   "+prn2.hashCode());
	     
	         System.out.println("prn1==prn2?"+(prn1==prn2));

	         //invoke the b.methods
	          prn1.print("hello");
	          prn2.print("hai");


	}

}
