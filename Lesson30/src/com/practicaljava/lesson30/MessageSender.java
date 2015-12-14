package com.practicaljava.lesson30;

import com.sun.messaging.ConnectionConfiguration;
import com.sun.messaging.ConnectionFactory;

import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.Session;
import javax.jms.TextMessage;


public class MessageSender {
 public static void main(String[] args){
	 Session session=null;
	 ConnectionFactory factory;
	 QueueConnection connection=null;
	 
	 try{
	      factory = new com.sun.messaging.ConnectionFactory();  
	      factory.setProperty(ConnectionConfiguration.imqAddressList, "mq://127.0.0.1:7677,mq://127.0.0.1:7677");
	      connection = factory.createQueueConnection("admin","admin");
	      
	      connection.start();

	      session = connection.createQueueSession( 
	                          false, Session.AUTO_ACKNOWLEDGE);
	      Queue ioQueue = session.createQueue("TestQueue");
	      MessageProducer queueSender = session.createProducer(ioQueue);
	      
	      // Buy 200 shares of IBM at market price	      
	      TextMessage outMsg = session.createTextMessage("IBM 200 Mkt");
	     
	      queueSender.send(outMsg);
	      queueSender.close();
	      
	      System.out.println("Sucsessfully placed an order to purchase 200 shares of IBM");
	    }
	    catch (JMSException e){
	           System.out.println("Error: " + e.getMessage());
	    } 
	    finally{
	       try{
	          session.close();
	          connection.close();
	       } catch (Exception e) {
	          System.out.println("Can�t close JMS connection/session " + e.getMessage());
	      }
	    }	
}	
	
}
