//Runner  class
package com.nt.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.nt.controller.PayrollMgmtOperationsController;
import com.nt.model.Employee;

@Component
public class MiniProjectTestRunner implements CommandLineRunner {
  @Autowired
  private   PayrollMgmtOperationsController  controller; 

  @Override
  public void run(String... args) throws Exception {
    System.out.println("MiniProjectTestRunner.run()");
  
  // read inputs from the enduser
  Scanner  sc=new Scanner(System.in);
  System.out.println("Enter Desg1 ::");
  String desg1=sc.next();
  
  System.out.println("Enter Desg2 ::");
  String desg2=sc.next();
  
  
  System.out.println("Enter Desg3 ::");
  String desg3=sc.next();
  
  
  //invoke the b.methods
    List<Employee>  list=controller.showEmployeesByDesgs(desg1,desg2,desg3);
    //display  result
    System.out.println("Employees belonging to  "+desg1+"  "+desg2+"  "+desg3+" are ");
    list.forEach(emp->{
      System.out.println(emp);
    });
  }

}
