package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		 
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(3000);
		 WebElement firstElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		 String leadId = firstElement.getText();
		 System.out.println(leadId);
		 firstElement.click();
		 
		 //Click Delete Button
		 driver.findElement(By.linkText("Delete")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='id']")).sendKeys(leadId);
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(3000);
		 String text = driver.findElement(By.xpath("//table/following-sibling::div[text()='No records to display']")).getText();
		 if(text.equals("No records to display"))
			 System.out.println(leadId + " successfully deleted and verified");
		 else
			 System.out.println(leadId + " not deleted");
		 driver.close();
	}
}
