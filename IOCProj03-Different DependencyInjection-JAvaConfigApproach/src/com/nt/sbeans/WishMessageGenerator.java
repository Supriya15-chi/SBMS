//WishMessageGenerator.java (target spring bean class) 
package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

	@Component
	public class WishMessageGenerator {
		@Autowired
		private  LocalTime  lt;  // HAS-A property
		private  LocalDate  ld;  // HAS -A property
		
		@Autowired
		public WishMessageGenerator(LocalDate ld ,LocalTime lt){
			this.ld=ld;
			this.lt=lt;
		
			System.out.println("WishMessageGenerator:: 2-param constructor");
		}
		
		@Autowired
		public  void  assign(LocalTime  lt) {
			System.out.println("WishMessageGenerator.assign()");
			
			this.lt=lt;
		}
		@Autowired
		public void   push(LocalDate  ld) {
			System.out.println("WishMessageGenerator.push()");
			this.ld=ld;
		}
	
		
		@Autowired
		public  void setLt(LocalTime lt) {
			System.out.println("WishMessageGenerator.setLt()");
			this.lt=lt;
		}
		
		@Autowired
		public void  setLd(LocalDate ld) {
			System.out.println("WishMessageGenerator.setLd()");
			
			this.ld=ld;
		}
		
		
		/*//alt+shift+s,o   (To  get parameterized constructor)
		@Autowired(required = false)
		public WishMessageGenerator(LocalTime lt, LocalDate ld) {
		 System.out.println("WishMessageGenerator:: 2-param constructor");
		this.lt = lt;
		this.ld = ld;
		}
		
		//alt+shift+s,o   (To  get parameterized constructor)
		@Autowired(required = false)
		public WishMessageGenerator(LocalTime lt) {
		System.out.println("WishMessageGenerator:: 1-param constructor");
		this.lt = lt;
		this.ld = ld;
		}
		*/ 	
	
	/*	@Autowired
		public void setLt(LocalTime lt) {
			System.out.println("WishMessageGenerator.setLt()");
			this.lt = lt;
		}
	
		@Autowired
		public void setLd(LocalDate ld) {
			System.out.println("WishMessageGenerator.setLd()");
			this.ld = ld;
		}
	*/
	//b.method
 	public String   generateWishMessage(String user) {
 		System.out.println("WishMessageGenerator.generateWishMessage()::"+lt+"...."+ld);
 		// get current hour of the day
 		int hour=lt.getHour();  // In 24 hrs format
 		if(hour<12 )
 			return  "Good Morning :"+user;
 		else if(hour<16)
 			return  "Good AfterNoon:"+user;
 		else if(hour<20)
 			return "Good Evening:"+user;
 		else
 			return "Good Night:"+user;
 	}

	
 	

	

}
