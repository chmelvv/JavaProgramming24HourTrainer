package com.practicaljava.lesson25;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class StartServer {

  public static void main (String args[]) {
	  	  
    try {
   LocateRegistry.createRegistry(1099);
    StockServerImpl ssi = new StockServerImpl();
    Naming.rebind("rmi://localhost:1099/QuoteService",ssi);

    System.out.println("<QuoteService> server is ready.");

   }catch (MalformedURLException e1){
	  System.out.println(e1.getMessage());   
   }catch(RemoteException ex) {
	   ex.printStackTrace();
   }
  }
}
