package com.practicaljava.lesson21;

import java.util.concurrent.Callable;  
   
 class PortfolioCallable implements Callable<Double> {
  private Double price;

  PortfolioCallable(Double price){
   this.price = price;
  }

  public Double call() throws Exception {
   for (int i=0; i<5;i++){
	Thread.sleep (700);    // Sleep for 700 milliseconds 
       System.out.println( "You have " +  (500 + i) +  
                                      " shares of IBM");
   }
   return 504*price;
  }

 }