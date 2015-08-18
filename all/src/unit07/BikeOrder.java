package unit07;

public class BikeOrder {
 
	public void validateOrder(String bikeModel, int quantity) throws TooManyBikesException {	
			if (bikeModel.equals("Ukraine") && quantity > 5) {
				throw new TooManyBikesException("Cannot ship " + quantity + " bikes of the model " + bikeModel);
			} else {
				System.out.println("Ordered: " + quantity + " of " + bikeModel);
			}
		}
	}
