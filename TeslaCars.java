package week1.day1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.compress.utils.Lists;

public class TeslaCars {
	public static void main(String[] args) {
		String s = "tesla cars";
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
		}
		List<Character> list = new ArrayList<Character>();
		for (Entry<Character, Integer> entry : map.entrySet()) {

			int value = entry.getValue();
			if (value == 1) {
				list.add(entry.getKey());

			}

		}
		
		System.out.println("The last non-duplicate character in "+s+" is :" +list.get(list.size() - 1));
		List<Character> list1 = new ArrayList<Character>();
		for (Entry<Character, Integer> entry : map.entrySet()) {

			int value = entry.getValue();
			if (value > 1) {
				list1.add(entry.getKey());

			}

		}
		System.out.println("The first duplicate character in " +s+ "is : "+list1.get(0));
		System.out.println("The last duplicate character in  "+s+" is :" +list1.get(list1.size() - 1));

	}
}
