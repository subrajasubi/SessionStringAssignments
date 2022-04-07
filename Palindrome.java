package demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Palindrome {

	public static void main(String[] args) throws InterruptedException {

		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String value = "madam", rev = "";
		int length = value.length();
		for(int i = length - 1;i >= 0;i--) {
		rev = rev + value.charAt(i);
				}
		System.out.println(rev);
		if(value.equals(rev)) {
			System.out.println("it is palindrome");
		}
		else {
		    System.out.println("it is not palindrome");
		}
		
		
		}
        
         
		

	}


