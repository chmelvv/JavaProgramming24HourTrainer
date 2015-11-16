package com.practicaljava.lesson21;

import java.util.concurrent.Callable;  
   
 class MarketNewsCallable implements Callable<Double> {

  public Double call() throws Exception {
   
	  for (int i=0; i<5;i++){
	       Thread.sleep (1000);  // sleep for 1 second
	       System.out.println( "The market is improving " + i);
	      } 
   // Just return some number
   return 12345.0;
  }  
 }  