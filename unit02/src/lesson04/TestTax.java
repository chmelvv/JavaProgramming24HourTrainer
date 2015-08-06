package lesson04;

public class TestTax {

	public static void main(String[] args) {
		double grossIncome; // local variables
		String state;
		int dependents;
		grossIncome= 50000;
		dependents= 2;
		state= "NJ";
		Tax t = new Tax(grossIncome, state, dependents);
		
		double yourTax = t.calcTax(); //calculating tax
		
		// Printing the result
		System.out.println("Your tax is USD: " + yourTax);
		System.out.println("Your tax is EUR: " + Tax.usdToEuro(yourTax));
		
		Tax t2 = new Tax(65000, "TX", 4 );
		double hisTax = t2.calcTax();
		System.out.println("His tax is USD: " + hisTax);
		System.out.println("Your tax is EUR: " + Tax.usdToEuro(hisTax));

	}

}
