package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1)Launch browser(chrome)
		 * 2)Open url https://demo.opencart.com/
		 * 3)validate title should be "Yours store"
		 * 4)Close browser
		 * 
		 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		String get_title = driver.getTitle();
		
		if(get_title.equals("Your Store")) {
			
			System.out.println("Test Passed");
		}
		
		else {
			
			System.out.println("Test Failed");
		}
		
		driver.close();

	}

}
