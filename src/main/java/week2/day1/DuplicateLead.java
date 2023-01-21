package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		//Opening a Browser
		ChromeDriver driver=new ChromeDriver();
		 
		 //load the URL
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 
		 //Maximize the browser
		 driver.manage().window().maximize();
		 
		 // Find username and Password - Enter the Value
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Find the CRM/SFA link and click
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //Find Create Lead and click
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Black");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jaguar");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("King");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test Engineering");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Description");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");
		 driver.findElement(By.name("submitButton")).click();
		 System.out.println("Title is "+ driver.getTitle());
		 
		 //Duplicate Lead
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		 companyName.clear();
		 companyName.sendKeys("Zoho");
		 WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		 firstName.clear();
		 firstName.sendKeys("White");
		 driver.findElement(By.name("submitButton")).click();
		 System.out.println("Title is "+ driver.getTitle());
		 driver.close();
	}

}
