package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,6,8,10,12};
		List<Integer> emptyList = new ArrayList<Integer>();
		for (Integer each : data) {
			emptyList.add(each);
		}
		Collections.sort(emptyList);
		for (int i = 0; i < emptyList.size()-1; i++) {
			if (emptyList.get(i+1)!=emptyList.get(i)+1) {
				System.out.println(emptyList.get(i)+1);
				
			}
		}
		
	}}