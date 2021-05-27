package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> colours =new HashMap<>();
		colours.put(1, "Pink");
		colours.put(2, "Red");
		colours.put(3, "White");
		colours.put(4, "Blue");
		colours.put(5, "Yellow");
		System.out.println("the initial map values are "+colours);
		
		System.out.println("The colour removed is " +colours.remove(2));
		System.out.println("The present of clour green is " +colours.containsValue("Pink"));
		System.out.println("The total number of coluors present currently is " +colours.size())
		
		
;
	}

}
