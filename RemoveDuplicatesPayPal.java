package demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesPayPal {
	//PaylIndi

	public static void main(String[] args) {
	String str = "PayPal India";
	char[] charArray = str.toCharArray();
	Set<Character> set = new LinkedHashSet<Character>();
	//to add each character into set without space
	for (Character each : charArray) {
		if (!each.equals(' ')) {
			set.add(each);
		}
		
	}
	//to get the actual output
	for (Character eachCharcter : set) {
		System.out.print(eachCharcter);
	}
	//to convert into string
	String output  = "";
	for (Character character : set) {
		output=output+character;
	}
	System.out.println(output);
	}

}
