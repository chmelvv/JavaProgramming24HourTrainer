# Walkthrough	1	(start)	
1. Download	and	import	the	source	code	for	Lesson	14	into	Eclipse	
2. Add	the	following	code	to	the	end	of	the	method	main()		in	the	class	Test:	
	Order ord = new Order();
	customers.add(ord);
	int totalElem = customers.size();
	for (int i=0; i< totalElem;i++){
		Customer currentCust =(Customer) customers.get(i);
 	}
3.	Run	Test	and	observe	the	run5me	excep5on	
4.	Put	the	breakpoint	(right-click	|	Toggle	breakpoint)	on	the	line	
 for (int i=0; i< totalElem;i++){
5.	Debug	the	program.	Observe	the	content	of	the	variable	customers
6.	Modify	the	class	Customer	to	look	like	this:	
public class Customer {
 String firstName;
String lastName;

public Customer (String a, String b){
! !firstName=a;
! !lastName=b;
}
}
7.	Add	the	following	line	to	the	end	of	method	main()	in	class	Test:
System.out.println("The current customer is “ + currentCust.lastName);
Why	the	program	doesn’t	compile?	
8.	Move	the	println()	line	inside	the	for-loop	and	run	the	program.	
9.	Observe	the	output	on	the	console	and	explain	it:	
The	current	customer	is	Lee	
The	current	customer	is	Starr	
Excep5on	in	thread	"main"	java.lang.ClassCastExcep5on:	Order	cannot	be	cast	to	Customer	
at	Test.main(Test.java:23)
