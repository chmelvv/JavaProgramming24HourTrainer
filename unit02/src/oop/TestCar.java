package oop;

public class TestCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.color = "blue";
		car2.color = "red";
		
		System.out.println("Cars have been painted car1: " + car1.color + " car2: " + car2.color);

	}

}
