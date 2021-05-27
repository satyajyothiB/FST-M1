package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList =new ArrayList<String>();
		myList.add("car");
		myList.add("Bus");
		myList.add("Cycle");
		
		for(String str :myList) {
			System.out.println(str);
		}
		
		System.out.println("Name car presence is "+myList.contains("car"));
		System.out.println("The number of elements in the list is "+myList.size());
		myList.remove("Bus");
		System.out.println("The number of elements in the list is "+myList.size());
		

	}

}
