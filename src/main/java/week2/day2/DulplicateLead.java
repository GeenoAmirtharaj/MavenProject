package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DulplicateLead {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Opening a Browser
		ChromeDriver driver=new ChromeDriver();
		 
		 //load the URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Find the CRM/SFA link and click
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //Find Lead link and click
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //Find Create Lead and click
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("i@gmail.com");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(3000);
		 WebElement firstElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		 String leadId = firstElement.getText();
		 System.out.println(leadId);
		 firstElement.click();
		 
		 //Click Duplicate Lead Button
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 String name = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		 if(driver.getTitle().trim().contains("Duplicate Lead"))
			 System.out.println("Duplicate Lead screen present");
		 else
			 System.out.println("Dulplicate Lead screen not displayed");
		 driver.findElement(By.xpath("//input[@name='submitButton' and @value= 'Create Lead']")).click();
		 
		 // Check the created name is equal and same as Duplicated one
		 String result = driver.findElement(By.xpath("//span[text()='First name']/following::span[@id='viewLead_firstName_sp']")).getText();
		 if(name.trim().equals(result))
			 System.out.println("Duplicate Lead name is Correct");
		 else
			 System.out.println("Dulpicate Lead name not correct");
		 driver.close();
	}
}
