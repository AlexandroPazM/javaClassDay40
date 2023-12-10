package javaClassDay40;

import java.util.LinkedList;

public class DemoLinkedList1 {
	
	public static void main(String[] args) {
		
		//LinkedList Object
		LinkedList<String> nameList = new LinkedList<String>();
		
		//add element
		
		nameList.add("James");
		nameList.add("Chiris");
		nameList.add("Mershelle");
		nameList.add("Charlene");
		nameList.add("Brandon");
		
		//Print
		System.out.println(nameList);
		
		//get the size
		System.out.println(nameList.size());
		
		// get the element at index position 2
		System.out.println(nameList.get(2));
		
		System.out.println("***********");
		//for loop --> print each value
		
		for(int i =0; i <nameList.size(); i++) {
			System.out.println(nameList.get(i));
			
		}
		
		//add element in the beginning of linkedList
		nameList.addFirst("Gonzalo");
		
		//add element in the end of the linkedList
		nameList.addLast("Ashlee");
		
		System.out.println(nameList);
		
	}

}
