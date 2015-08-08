#-[x]Walkthrough 1 
* Create a new Eclipse Java project called OOP 
* Write a class Car using the sample code above 
* Write a class TestCar that creates two instances of the class Car, changes their colors and prints the message about it.
* Run the class TestCar. Observe the message in the view Console

#-[x]Walkthrough 2
* Add two more classes to the OOP project: Tax and TestTax. 
* Run the TestTax and observe that it always prints 234.55 as calculated text 
* Modify the code of the calcTax() method to print the tax as 6% of of gross income if it was up to $50000 and 8% otherwise. 
* Run the TestTax program and see if the tax is properly calculated. Change the value of grossIncome and re-run the program.

#-[x]Walkthrough 3
* Add to the OOP project the class NJTax that will have the calcTax() method with the same signature as in Tax
* Add the code to NJTax.calcTax() method to print the tax as 10% of of gross income if it was up to $50000 and 13% otherwise. 
* Run exisEng TestTax and observe that your changes didn’t have any effect on the calculate tax. Why?
* Change the code of the TestTax to instanEate NJTax instead of Tax. 
* Run the TestTax program again and observe that now the new percentage is properly applied. You are using the overriden version of the method calcTax().

#-[x]Homework 1
1. Study the lessons 3 and 4 from the textbook and do the assignment from the Try It secEons of these lessons. 
2. From now on use the following Java SE 7 documentaEon: http://download.oracle.com/javase/7/docs/ 

##Additional Reading 
* Overriding vs. hiding: http://www.coderanch.com/how-to/java/OverridingVsHiding 
* Eclipse Debugging tutorial by Lars Vogel: http://www.vogella.com/arEcles/EclipseDebugging/arEcle.html
