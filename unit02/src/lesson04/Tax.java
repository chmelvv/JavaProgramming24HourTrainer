package lesson04;

public class Tax {
	double grossIncome;
	String state;
	int dependents;
	static int customerCounter;
	
	public Tax(double gi, String st, int depen){
		grossIncome = gi; // member variable initialization
		state = st;
		dependents=depen;
		customerCounter++; // increment the counter by one
		System.out.println("Preparing the tax data for customer #" + customerCounter);
	}
	
	public double calcTax(){
		return (grossIncome*0.33 - dependents*100);
	}
	
	public static double usdToEuro(double usd){
		return usd/1.25;
	}
}
