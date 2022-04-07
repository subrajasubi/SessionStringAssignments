package demo;

public class PrintDuplicates {

	public static void main(String[] args) {

		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			
         int length = arr.length;
        
         System.out.println("Count of duplicate numbers: ");
         for (int i = 0; i < length-1; i++) {
        	 int count  =1;
        	for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			
				
				
			}
        	if(count>1) {
        		System.out.println(arr[i]);
        	}
        	
        
        	 
		}
        
         
		

	}

}
