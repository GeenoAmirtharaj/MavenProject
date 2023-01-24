package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//Opening a Browser
		ChromeDriver driver=new ChromeDriver();
		 
		 //load the URL
		 driver.get("https://www.leafground.com/input.xhtml");
		 driver.manage().window().maximize();
		 //Type your name
		 driver.findElement(By.id("j_idt88:name")).sendKeys("Black");
		 //Append Country to this City
		 driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" India");
		 //Verify if text box is disabled
		 if (driver.findElement(By.id("j_idt88:j_idt93")).isEnabled() == false)
			 System.out.println("Text box is disabled");
		 else
			 System.out.println("Text box is not disabled");
		 //Clear the typed text
		 driver.findElement(By.id("j_idt88:j_idt97")).clear();
		 //Retrieve the typed text
		 System.out.println(driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value"));
		 //Type email and Tab. Confirm control moved to next element
		 WebElement eleTab = driver.findElement(By.id("j_idt88:j_idt99"));
		 eleTab.sendKeys("Hai@gmail.com");
		 eleTab.sendKeys(Keys.TAB);
		 //Type about yourself
		 driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("this is Text Area");
		 //Text Editor
		 driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']//p")).sendKeys("Editor space");
		 //Just Press Enter and confirm error message*
		 driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 System.out.println("Error Message Printed correctly: "+driver.findElement(By.className("ui-message-error-detail")).getText().trim().equals("Age is mandatory"));
		 //Click and Confirm Label Position Changes
		 WebElement userName = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']/following::label[text()='Username']"));
		 driver.executeScript("arguments[0].click()", userName);
		 //Type your name and choose the third option
		 driver.findElement(By.xpath("//div[@id='j_idt106:auto-complete']/ul//input")).sendKeys("gee");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@role='tooltip']/following::span//li[3]")).click();
		 //Click and Confirm Keyboard appears
		 driver.findElement(By.id("j_idt106:j_idt122")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Close']")).click();
		 // Custom Toolbar
		 driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']//p")).sendKeys("THis is custome toolbar");
		 driver.close();
	}

}
