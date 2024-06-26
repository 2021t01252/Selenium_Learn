package day02;

import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.opencart.com/");

		driver.manage().window().maximize();

		  
		// name locator
		  
		  driver.findElement(By.name("search")).clear();
		  driver.findElement(By.name("search")).sendKeys("Mac");
		  
		  // id locator
		  
		  WebElement logo = driver.findElement(By.id("logo")); boolean display_status =
		  logo.isDisplayed(); System.out.println(display_status);
		  
		  // linktext & partiallinktext
		  
		  //driver.findElement(By.linkText("Tablets")).click();
		  driver.findElement(By.partialLinkText("blets")).click();
		 
		  // class name
		
		  List<WebElement> header_link =
		  driver.findElements(By.className("list-inline-item"));
		  System.out.println("Total number of header links: " + header_link.size());
		

		  // tag name

		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  System.out.println("Total number of links: " + links.size());
		  
		  List<WebElement> images = driver.findElements(By.tagName("img"));
		  System.out.println("Total number of images: "+images.size());

	}

}
