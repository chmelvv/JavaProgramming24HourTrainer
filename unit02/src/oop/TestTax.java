package oop;

public class TestTax {

	public static void main(String[] args) {
		Tax t = new Tax();
		t.dependents = 2;
		t.grossIncome = 1000.0;
		t.state = "NJ";
		
		System.out.println(t.calcTax());
		
	}

}
