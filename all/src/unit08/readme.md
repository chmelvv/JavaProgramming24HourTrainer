# Walkthrough	1	(start)	
- [x]
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

# Walkthrough	2	(start)	
- [x]
1.	Download	and	import	the	source	code	for	the	Lesson	15.	
2.	Run	the	program	TestGenericCollec5on	–	it’ll	print	the	following:	
								
							Customer	David	Lee.	In	doSomething()	
							Customer	Ringo	Starr.	In	doSomething()	
3.	Un-comment	the	lines	16	and	17	to	add	an	Order instance	into		
				the	collec5on	customers.	
4.	Observe	the	compiler	error	-	can’t	add	
					Order	to	the	collec5on	of	Customer	objects.	
					
5.	Remove	both	<Customer>	parameters	from	line	10.		
				Compiler	will	stop	complaining.	
6.	Run	the	program	to	see	the	run-)me	class	cast	excep5on.	
				You’ve	added	the	wrong	object	to	the	collec5on,		but	compiler		
				didn’t	catch	this	error.	
Excep5on	in	thread	"main"	java.lang.ClassCastExcep5on:		
																																																												Order	cannot	be	cast	to	Customer	
Customer	David	Lee.	In	doSomething()	
Customer	Ringo	Starr.	In	doSomething()	
at	TestGenericCollec5on.processData(TestGenericCollec5on.java:28)	
at	TestGenericCollec5on.main(TestGenericCollec5on.java:23)	

# Homework	
* Do	the	assignments	from	the	Try	It	sec5ons	of	Lesson	14 and 15
	
- [x] Modify the LinkedList example from Listing 11-5 to add an arbitrary object, say, the VIP
customer after the very first element of the list. You must do this while iterating through
the list. When the program is ready it should print the following:
	Alex Smith
	VIP Customer
	Mary Lou
	Sim Monk

- [x] Create a simple program that uses generics with the class RetiredEmployee (which
extends the class Employee) from Listing 7-2. Write a generic method that accepts a
collection of RetiredEmployee objects and copies it into a collection of Employee objects.
Use the method unloadToDock() from class Ferry as an example.

# Addi5onal	Read	
- [ ] Java	8,	use		the	method	forEach()	to	iterate	collec5ons
- [ ] Study	the	Oracle’s	Java	Generics	Tutorial	at	https://docs.oracle.com/javase/tutorial/java/generics/	
- [ ] Watch	this	preso	from	the	JavaOne	conference	on	generics:	
https://www.youtube.com/watch?v=34oiEq9nD0M&index=36&list=PLKCk3OyNwIztOH7f5C72NahQrsxzPb3P_
	
