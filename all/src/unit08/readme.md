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

# Walkthrough	2	(start)	
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
Do	the	assignments	from	the	Try	It	sec5ons	of	
Lesson	14	and	15		

# Addi5onal	Read	
Linked	lists:	hIp://bit.ly/1gxCz5I		
		
Study	the	Oracle’s	Java	Generics	Tutorial	at	hIp://bit.ly/1if4njs		
Watch	this	preso	from	the	JavaOne	conference	on	generics:	
hIp://bit.ly/14k7ORf
A	simple	example	of	using	parameterized	type	<T>	
hIp://bit.ly/1mfsQsS	
