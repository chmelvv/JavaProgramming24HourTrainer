package unit04;

import java.util.ArrayList;

public class TestHuman {

	public static void main(String[] args) {
		ArrayList<Human> humans = new ArrayList<Human>();
		for (int i=0; i<10; i++){
			if (i%2 == 0) {
				humans.add(new Man("Man"+i));
			}
			else humans.add(new Woman("Woman"+i));
		}
		
		for (Human h: humans) {
			System.out.println(h.getName());
			((Dressable)h).dressIn();
			System.out.println();
		}

	}

}
