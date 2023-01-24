package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedXpath {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 //Find Lead first element
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[contains(@class, 'decorativeSubmit')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		 String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		 System.out.println("First element in Find Lead is "+text);
		 driver.close();
		//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a
		//ul[@class='brand-list']//input[@value='Flying Machine']
		//div[@class='slds-form-element__control']//input
		 
		 
		 
	}

}
