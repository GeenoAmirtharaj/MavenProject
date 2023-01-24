package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		 
		 driver.findElement(By.xpath("//label[text()='Lead ID:']/parent::div/following-sibling::div//input[@name='firstName']")).sendKeys("Har");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 
		 //Click Edit Lead Button
		 if(driver.getTitle().trim().contains("View Lead"))
			 System.out.println("View Lead screen present");
		 else
			 System.out.println("View Lead screen not displayed");
		 driver.findElement(By.linkText("Edit")).click();
		 WebElement eleCompany = driver.findElement(By.id("updateLeadForm_companyName"));
		 String companyName = "New Company";
		 eleCompany.clear();
		 eleCompany.sendKeys(companyName);
		 driver.findElement(By.xpath("//input[@name='submitButton' and @value= 'Update']")).click();
		 
		 //Verify the company name
		 String viewLeadCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 if(viewLeadCompanyName.trim().contains(companyName))
			 System.out.println(companyName + " Edited Correctly");
		 else
			 System.out.println("Incorrect Company name in View Lead");
		 
		 driver.close();
	}
}
//label[text()='Lead ID:']/parent::div/following-sibling::div/