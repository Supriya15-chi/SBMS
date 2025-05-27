package com.nt.ston;

public class Printer{
    private   static   Printer  INSTANCE;

   // private  constructor
  private  Printer(){
    System.out.println("Printer:: 0-param constructor");
    }

   // static factory method
   public   static  Printer   getInstance(){
	   System.out.println("Printer.getInstance()");
	   
        if(INSTANCE==null)
              INSTANCE=new Printer();
         return  INSTANCE;
    }

  public   void print(String msg){
       System.out.println(msg);
  }
   
}//class
