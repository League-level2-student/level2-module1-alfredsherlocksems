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
		for (int i = 0; i < stringArrayList.size(); i++) {
			System.out.println(stringArrayList.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String word: stringArrayList) {
			System.out.println(word);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < stringArrayList.size(); i+=2) {
			System.out.println(stringArrayList.get(i));
		}
		//6. Print all the Strings in reverse order.
		for (int i = stringArrayList.size() - 1; i >= 0; i--) {
			
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
