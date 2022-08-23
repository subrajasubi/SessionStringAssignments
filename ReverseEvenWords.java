package week1.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String str= "I am a software tester";
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				char[] charArray = split[i].toCharArray();
				for (int j = charArray.length-1; j >=0; j--) {
					System.out.print(charArray[j]);
				}
			}
			else {
				System.out.print(" "+split[i]+" ");
			}
		}
//
//		//Split the Text
//		String[] splt=str.split(" ");
//
//		//Loop through the condition
//
//		for (int i = 0; i < splt.length; i++)
//		{
//			if (i%2 != 0) 
//			{
//				// change the even index string to character
//
//				char[] chr= splt[i].toCharArray();
//				for (int j = chr.length-1; j >= 0; j--) 
//				{
//					System.out.print(chr[j]);
//				}
//
//			}else
//			{
//
//				System.out.print(" "+splt[i]+" ");
//
//			}
//		}
}
}