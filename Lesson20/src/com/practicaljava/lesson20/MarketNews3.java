package com.practicaljava.lesson20;public class MarketNews3 extends Thread {    Object parent;   public MarketNews3 (Object theLockKeeper) {    super("ssssss");       parent = theLockKeeper;   }  public void run() {    try{      for (int i=0; i<10;i++){       sleep (500);  // sleep for 1 second       System.out.println( "The market is improving " + i);          if (i==5) parent.notifyAll();      }     }catch(InterruptedException e ){       System.out.println(Thread.currentThread().getName()                                         + e.toString());    }       }}