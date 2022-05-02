package week4.day1.assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IntersectionWithCollection {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		int[] array1 = {3,2,11,4,6,7};	
		int[] array2 = {1,2,8,4,9,7};
	    Set<Integer> emptyDup1 = new LinkedHashSet<Integer>();
	    Set<Integer> emptyDup2 = new LinkedHashSet<Integer>();
	 
	    	for (int i = 0; i < array1.length; i++) {
	    		emptyDup1.add(array1[i]);
	    		for (int j = i+1; j < array2.length; j++) {
	    		emptyDup2.add(array2[j]);
			}
	    	}
	    	emptyDup1.retainAll(emptyDup2);
	    	System.out.println("The intersection of both Arrays are : " +emptyDup1);
	    }
	
		
		}

