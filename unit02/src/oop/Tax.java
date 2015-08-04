package oop;

public class Tax {
	double grossIncome;
	String state;
	int dependents;
	
	public double calcTax(){
		if (grossIncome > 50000) return grossIncome*0.08;
		else return grossIncome*0.06;
	}
}
