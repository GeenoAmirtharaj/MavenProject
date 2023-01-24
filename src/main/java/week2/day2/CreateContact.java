package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Opening a Browser
		ChromeDriver driver=new ChromeDriver();
		 
		 //load the URL
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 
		 //Login
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Find the CRM/SFA link and click
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //click contacts
		 driver.findElement(By.linkText("Contacts")).click();
		 
		 //click create contact
		 driver.findElement(By.linkText("Create Contact")).click();
		 
		 //Enter values
		 driver.findElement(By.id("firstNameField")).sendKeys("TestLeaf");
		 driver.findElement(By.id("lastNameField")).sendKeys("Black");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Black");
		 driver.findElement(By.xpath("//input[@name='departmentName' and @class='inputBox']")).sendKeys("Engineering");
		 driver.findElement(By.xpath("//span[text()='Description']/following::textarea[@name='description']")).sendKeys("Engineering");
		 driver.findElement(By.xpath("//span[text()='E-Mail Address']/following::input[@id='createContactForm_primaryEmail']")).sendKeys("hai@gmail.com");
		 WebElement eleStateProvince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select stateProvince = new Select(eleStateProvince);
		 stateProvince.selectByVisibleText("New York");
		 
		 //Click create contact
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 //Click Edit and Perform actions
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Note");
		 driver.findElement(By.xpath("//input[@name='submitButton' and @value='Update']")).click();
		 
		 //Title of resulting Page
		 System.out.println("Current Screen Title is "+ driver.getTitle());
		 
		 driver.close();
		 
	}

}
