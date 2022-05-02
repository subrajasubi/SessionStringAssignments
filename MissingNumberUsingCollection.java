package week4.day1.assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumberUsingCollection {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		int[] data = {1,2,3,4,7,6,8};
		Arrays.sort(data);
		List<Integer> emptyList = new ArrayList<Integer>();
		for (int i = 1; i < data.length; i++) {
			emptyList.add(data[i]);
			if(i!=data[i-1]) {
				System.out.println(i);
				break;
			}
		}
		
	    }
	
		
		}

