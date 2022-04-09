package stringassignments;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbersUsingList {
	
	
	

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
        List<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < arr.length-1; i++) {
			num.add(arr[i]);
			if(num.get(i)!=i+1){
			
        System.out.println("The missing number is " +(i+1));
        break;

}}}}