 package com.practicaljava.lesson21;
 
 import java.util.ArrayList;  
 import java.util.List;  
 import java.util.concurrent.ExecutionException;  
 import java.util.concurrent.ExecutorService;  
 import java.util.concurrent.Executors;  
 import java.util.concurrent.Future;  
   
 public class TestCallableThreads {  
   
  public static void main(String[] args)   
   throws InterruptedException, ExecutionException {  
    
   //A placeholder for Future objects
	List<Future<Double>> futures =
     new ArrayList<Future<Double>>();
   
    // A placeholder for results
	List<Double> results = new ArrayList<Double>();
   
   final ExecutorService service =   
     Executors.newFixedThreadPool(2);  
     
   try {  
  
    futures.add(service.submit(new PortfolioCallable(164.22)));
    futures.add(service.submit(new MarketNewsCallable())); 
 
    for (Future<Double> future : futures) {
     results.add(future.get());  
    }  
   
   } finally {  
    service.shutdown();  
   } 
   
   for (Double res: results){
      System.out.println("\nGot the result: " + res);
   }
  }  
 }  