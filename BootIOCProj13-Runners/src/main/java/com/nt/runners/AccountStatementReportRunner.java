package com.nt.runners;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(-20)
public class AccountStatementReportRunner implements ApplicationRunner {

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("AccountStatementReportRunner.run() (AR)");
    
    //  Display non-option arg values
    System.out.println("Non-Option arg values::"+args.getNonOptionArgs());
    
    System.out.println("Optio  Arg Name and Values are ::");
    //  get  Option arg names
     Set<String>  optArgNames=args.getOptionNames();
     optArgNames.forEach(name->{
       System.out.println(name+"....."+args.getOptionValues(name));
     });
    
  }//run(-)
  
 

}//class
