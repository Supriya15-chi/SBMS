package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(-10)
public class SalesReportRunner implements CommandLineRunner,Ordered {

  @Override
  public void run(String... args) throws Exception {
    System.out.println("SalesReportRunner.run() (CLR)");
    
    System.out.println("Comand line args are "+Arrays.toString(args));
    }
  
  @Override
  public int getOrder() {
    return -20;
  }

}
