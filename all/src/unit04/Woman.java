package unit04;

public class Woman extends Human implements Dressable{

	public Woman(String name) {
		super(name);
	}

	@Override
	public void dressIn() {
		System.out.println("I dress in skirt");
		
	}

}
