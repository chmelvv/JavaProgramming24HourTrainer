package unit03;

import lesson04.Tax;

class TestTax{
public static void main(String[] args){
	double grossIncome = Double.parseDouble(args[0]);
	String state = args[1];
	int dependents = Integer.parseInt(args[2]);

	Tax t = new Tax(grossIncome, state, dependents);
	double yourTax = t.calcTax(); //calculating tax
	//Printing the result
	System.out.println("Your tax is " + yourTax);
}
}
