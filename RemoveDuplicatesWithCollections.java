package week4.day1.assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWithCollections {

	public static void main(String[] args) throws InterruptedException, IOException {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> dup = new LinkedHashSet<String>();
		for (String each : split) {
			dup.add(each);
			
		}
		System.out.println(dup+",");
		
		
		
			
		}

}