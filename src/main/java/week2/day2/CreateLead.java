package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Opening a Browser
		ChromeDriver driver=new ChromeDriver();
		 
		 //load the URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 //Maximize the browser
		 driver.manage().window().maximize();
		 
		 // Find username and Enter the Value
		 WebElement eleUsername = driver.findElement(By.id("username"));
		 eleUsername.sendKeys("DemoSalesManager");
		 
		 //Find password field and enter the value
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 //Find Login button and click
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Find the CRM/SFA link and click
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //Find Lead link and click
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //Find Create Lead and click
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Black");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jaguar");
		 
		 //Select the Drop down element
		 WebElement elementSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select value = new Select(elementSource);
		 value.selectByVisibleText("Conference");
		 driver.findElement(By.name("submitButton")).click();
		 driver.close();
		 
	}

}
