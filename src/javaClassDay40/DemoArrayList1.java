package javaClassDay40;

import java.util.ArrayList;

public class DemoArrayList1 {
	
	public static void main(String[] args) {
		
		
		//Created ArrayList object
		ArrayList<String> state = new ArrayList<String>();
		
		//Adding new element to the ArrayList
		
		state.add("VA");
		state.add("NY");
		state.add("TX");
		state.add("FL");
		state.add("CA");
		
		
		//print ArrayList
		System.out.println(state);
		
		System.out.println("*********************");
		//add "NC"  at index 1
		state.add(1,"NC");
		System.out.println(state);
		
		//get the number of element in the arrayList
		System.out.println("Size: " + state.size());
		
		//get the value at index position 4
		System.out.println("Retriev Value: " + state.get(4));
		
		//remove value from arrayList
		state.remove(2);
		System.out.println("After removing: " + state);
		
	}

}
