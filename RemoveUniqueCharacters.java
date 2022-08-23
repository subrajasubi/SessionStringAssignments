package week1.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveUniqueCharacters {
	public static void main(String[] args) {
        String text = "babu";
		char[] charArray = text.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (Character each : charArray) {
			set.add(each);
		}
		List<Character> list = new ArrayList<Character>(set);
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < charArray.length; j++) {
				if(list.get(i)==charArray[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(list.get(i));
			}
		}
		
}
}