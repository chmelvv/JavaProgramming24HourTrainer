package oop;

public class NJTax extends Tax{
	public double calcTax(){
		if (grossIncome > 50000) return grossIncome*0.13;
		else return grossIncome*0.1;
	}
}
