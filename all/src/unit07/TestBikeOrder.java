package unit07;

public class TestBikeOrder {
public static void main(String[] args){
	BikeOrder bikeOrder= new BikeOrder();
		try {
			bikeOrder.validateOrder("Ukraine", 6);
			System.out.println("Order is valid");
		} catch(TooManyBikesException e) {
			System.out.println(e.getMessage());
		}

}
}