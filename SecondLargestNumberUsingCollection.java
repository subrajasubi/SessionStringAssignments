package week4.day1.assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestNumberUsingCollection {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		int[] data = {3,2,11,4,6,7};
			
		Arrays.sort(data);
		List<Integer> emptyList = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			
			if(data[i]==data[data.length-2]) {
				emptyList.add(data[i]);
		}
		
		
	}
		System.out.println(emptyList);
		
		}}

