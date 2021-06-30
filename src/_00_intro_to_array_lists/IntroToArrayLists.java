package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> stringArrayList = new ArrayList<String>();
		
		//2. Add five Strings to your list
		stringArrayList.add("Bob");
		stringArrayList.add("Dave");
		stringArrayList.add("Sam");
		stringArrayList.add("Kate");
		stringArrayList.add("Sally");
		//3. Print all the Strings using a standard for-loop
		
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < stringArrayList.size(); i++) {
			if (stringArrayList.get(i).contains("e")) {
				System.out.println(stringArrayList.get(i));
			}
		}
	}
}
