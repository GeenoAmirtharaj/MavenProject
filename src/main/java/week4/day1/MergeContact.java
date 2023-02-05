package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		//Opening a Browser
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //load the URL
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 
		 //Login
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Find the CRM/SFA link and click
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //click contacts
		 driver.findElement(By.linkText("Contacts")).click();
		 
		 //click Merge contact
		 driver.findElement(By.linkText("Merge Contacts")).click();
		 
		 //Click on From Contact icon
		 driver.findElement(By.xpath("(//input[@id='partyIdFrom']//following::img)[1]")).click();
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> windows = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(windows.get(1));
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-col-partyId')]/a)[1]")).click();
		 driver.switchTo().window(windows.get(0));
		 
		 //Click on To contact icon
		 driver.findElement(By.xpath("(//input[@id='partyIdFrom']//following::img)[2]")).click();
		 Set<String> windowHandlesTo = driver.getWindowHandles();
		 List<String> windowsTo = new ArrayList<String>(windowHandlesTo);
		 driver.switchTo().window(windowsTo.get(1));
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-col-partyId')]/a)[2]")).click();
		 driver.switchTo().window(windowsTo.get(0));
		 
		 //Click on merge button
		 driver.findElement(By.xpath("//a[text()='Merge']")).click();
		 
		 //Handle Alert
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 
		 //verify Title
		 String title = driver.getTitle();
		 if(title == "View Contact | opentaps CRM")
			 System.out.println("Merged contacts Successfully");
		 else
			 System.out.println("Merge Failed");
		 driver.close();
	}
}
