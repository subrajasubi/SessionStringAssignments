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

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 1. Launch the URL https://www.ajio.com/ 2. In the search box, type as "bags"
		 * and press enter 3. To the left of the screen under " Gender" click the "Men"
		 * 4. Under "Category" click "Fashion Bags" 5. Print the count of the items
		 * Found. 6. Get the list of brand of the products displayed in the page and
		 * print the list. 7. Get the list of names of the bags and print it
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
		//find the list of elements and store it in a variable
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Brand Names:---------------");
		//create an empty list
		List<String> items = new ArrayList<String>();
		//get the size of the list of elements(brands)
		int size = brands.size();
		//Print the size
		System.out.println(size);
		//iterate through each brands using for each loop
		for (WebElement each : brands) {
			//get the text of each brands in the loop
			String text = each.getText();
			//add each text in the empty list to get as a list of items
			items.add(text);
			
			
		}
		//print the added items
		System.out.println(items);
		System.out.println("Acending order");
		//to sort the list of items 
		Collections.sort(items);
		//to remove the duplicates in the list pass the list of items in set
		Set<String> items2 = new TreeSet<String>(items);
		//print the original items
		System.out.println(items2);
		int size2 = items2.size();
		System.out.println(size2);
		//find the list of bag names
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		System.out.println("Bag Names:---------------");
		//create another empty list
		List<String> names = new ArrayList<String>();
		//get the size of the list of bag names
		int size3 = bags.size();
		//print the size 
		System.out.println(size3);
		//iterate through each bag names
		for (WebElement each1 : bags) {
			//get the text of each bag names
			String text2 = each1.getText();
			//add the text in the empty list
			names.add(text2);
			
		}
		//sort the list of names
		Collections.sort(names);
		//print the list of sorted  names
		System.out.println(names);
		
		//create a set to remove duplicates in bag names
		Set<String> dup = new TreeSet<String>(names);
		//print the original list of names
		System.out.println(dup);
		
		int size4 = dup.size();
		System.out.println(size4);
        	 
		}
        
         
		

	}


