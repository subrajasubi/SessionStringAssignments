package week4.day1.assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintduplicateNumbersUsingCollection {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		List<Integer> emptyList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
					for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]) {
				emptyList.add(arr[i]);

				
			}
			
		}
					
		}
		System.out.println(emptyList);
	
	}
	
		
		}

