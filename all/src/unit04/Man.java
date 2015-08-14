package unit04;

public class Man extends Human implements Dressable{

	public Man(String name) {
		super(name);
	}

	@Override
	public void dressIn() {
		System.out.println("I dress in pants");
		
	}

}
