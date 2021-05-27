package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		System.out.println("The size of the hashset is "+hs.size());
		hs.remove(6);
		System.out.println("able to remove an element which is not available " +hs.remove(6));
			
		System.out.println("Present of element value 5 is  " +hs.contains(5));
		System.out.println(hs);
		
		
	}

}
