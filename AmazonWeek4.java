package assignmentWeek4;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWeek4 {


	public static void main(String[] args) throws InterruptedException, IOException {
		
//		1.Load the URL https://www.amazon.in/
//			2.search as oneplus 9 pro 
//			3.Get the price of the first product
//			4. Print the number of customer ratings for the first displayed product
//			5. Click the first text link of the first image
//			6. Take a screen shot of the product displayed
//			7. Click 'Add to Cart' button
//			8. Get the cart subtotal and verify if it is correct.
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus", Keys.ENTER);
		Thread.sleep(5000);
		String text3 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	//	System.out.println(text3);
		String replace2 = text3.replace(",", "");
		double parseDouble = Double.parseDouble(replace2);
		System.out.println(parseDouble);
		driver.findElement(By.xpath("//div[@class='a-row a-spacing-micro']/following::a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star a-star-4']/span"));
		Actions builder = new Actions(driver);
		builder.moveToElement(findElement).click().perform();
		Thread.sleep(3000);
		WebElement findElement2 = driver
				.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']"));
		String text2 = findElement2.getText();
		System.out.println(text2);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		String text = driver
				.findElement(By.xpath("//span[@id='attach-accessory-cart-total-string']/following::span[1]")).getText();
		String replace = text.replace("₹", "").replace(",", "");
		double parseDouble2 = Double.parseDouble(replace);
		System.out.println(parseDouble2);
		if (parseDouble==parseDouble2) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Not equal");
		}
		

	}

}
