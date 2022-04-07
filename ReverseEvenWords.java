package assignmentWeek4;

import java.util.Arrays;

public class ReverseEvenWords {
	public static void main(String[] args) {
		// Build a logic to reverse the even position words (output: I ma a erawtfos
				// tester)
				

					/*
					 * Declare the input as Follow String test = "I am a software tester";
					 */
					String input = "I am software tester";
					
					String outputString = "";
					// a) split the words and have it in an array
					String[] splitWords = input.split(" ");
					
					System.out.println(Arrays.toString(splitWords));
					// find the Length of Array
					int splitArrayLength = splitWords.length;
					System.out.println("Array length:" + splitArrayLength);
					// b) Traverse through each word (using loop)
					//c) find the odd index within the loop (use mod operator)
					
					//d)split the words and have it in an array
					// e)print the even position words in reverse order using another loop (nested
					// loop)
					for (int i = 0; i < splitArrayLength; i++) {
						// System.out.println(splitWords[j]);
						if ((i + 1) % 2 == 0) {
					/*f) Convert words to character array if the position is even
					else print the word as it is(concatenate space at the end).*/
							char[] charArray = splitWords[i].toCharArray();
							
							String reverseWord = "";
							
							for (int k = charArray.length - 1; k >= 0; k--) {
								//System.out.println(charArray[k]);
								
								reverseWord = reverseWord + charArray[k];
								
							}
							outputString = outputString+reverseWord+" ";
							
						} else {
							outputString = outputString+splitWords[i]+" ";
						}
					}
					
					System.out.println(outputString);
					
				

			}
		}
	


