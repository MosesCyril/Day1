package week2_day1;

import java.awt.event.WindowStateListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url as "http://leaftaps.com/opentaps"
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Locate the WebElement for username field.
		WebElement username = driver.findElement(By.id("username"));
		
		//Enter the username into the field as demosalesmanager , use a method sendKeys()
		username.sendKeys("demosalesmanager");
		
		//Locate the password field as 'crmsfa'
		WebElement password = driver.findElement(By.name("PASSWORD"));
		password.sendKeys("crmsfa");
		
		//Click Sign button
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		//Locate and click on the CRMSFA link
		WebElement hyperlink = driver.findElement(By.xpath("//a[@style = 'color: black;']"));
		hyperlink.click();
		
		//Locate and click on Leads tab
		WebElement leadsTab = driver.findElement(By.xpath("//a[text() = 'Leads']"));
		leadsTab.click();
		
		//Locate and click on the Create lead from shortcut 
		WebElement createlead = driver.findElement(By.xpath("//a[text() = 'Create Lead']"));
		createlead.click();
		
		//Locate the company field and enter as TestLeaf
		WebElement companyfield = driver.findElement(By.id("createLeadForm_companyName"));
		companyfield.sendKeys("TestLeaf");
		
		//Locate and enter first name as Gokul
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Gokul");

		//Locate the Source WebElement (Dropdown)
		//step 1: Locate the dropdown WebElement
		WebElement dropdownsrc = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step 2: Create a object for Select class and pass WebElement inside the Constrctor
		Select sel = new Select(dropdownsrc);
		
		//step 3: Select the value -5th
		sel.selectByIndex(4);
		
		//Locate the Industry and choose computer software
		WebElement dropdownind = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indsel = new Select(dropdownind);
		indsel.selectByVisibleText("Computer Software");
		
		//Locate the ownership 
		WebElement dropdownown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownsel = new Select(dropdownown);
		ownsel.selectByValue("OWN_PUBLIC_CORP");
		
		//Loctae and enter the last name as Sekar
		
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("Sekar");
		
		//Locate and click on the create lead button.
		
		WebElement submit = driver.findElement(By.className("smallSubmit"));
		submit.click();
		
		//Get the Lead ID
		WebElement leadid = driver.findElement(By.id("viewLead_companyName_sp"));
		leadid.getText();
		System.out.println(leadid.getText());
		
		
		//close the window
		driver.close();

	}

}
