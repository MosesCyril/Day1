package week2_day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1 : Launch the Browser
		
		  ChromeDriver driver = new ChromeDriver();
		  

		  // Shortcut to import --> ctrl + shift + o --> import organize --> import all the import statemnets at once and alsO remove the un used import statements FirefoxDriver fd = new FirefoxDriver();
		  
		
		 // Step2: Load the URL --> get()
		  
		  driver.get("https://www.google.com");
		  
		  // Step 3 Maximize the window
		  driver.manage().window().maximize();
		  
		  //Steps to pause 
		  Thread.sleep(2000); // 2000 milliseconds --> 2seconds --> Thread.sleep() wait for entire timeout
		  
		  
		  //Step 4 : Close the window
		  driver.close();
		  

	}

}
