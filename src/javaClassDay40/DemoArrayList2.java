package javaClassDay40;

import java.util.ArrayList;

public class DemoArrayList2 {
	
public static void main(String[] args) {
		
		
		//Created ArrayList object
		ArrayList<String> state = new ArrayList<String>();
		
		//Adding new element to the ArrayList
		
		state.add("VA");
		state.add("NY");
		state.add("TX");
		state.add("FL");
		state.add("CA");
		
		//Loops
		
		//using for each loops
		for(String st: state) {
		System.out.println(st);
		}
		System.out.println("***************");
		//using for loop
		
		for(int i =0; i< state.size(); i++) {
			System.out.println(state.get(i));
		}
		System.out.println("***************");
		// using while loop
		int j = 0;
		while(j<state.size()) {
			System.out.println(state.get(j));
			j++;
		}
		System.out.println("***************");
		//using do while loop
		int k =0;
		do {
			System.out.println(state.get(k));
			k++;
		}while(k<state.size());
		
		
		
	}

}
