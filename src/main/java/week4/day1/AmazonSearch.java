package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications", "--incognito", "--start-maximized");
		 //Opening a Browser
		 ChromeDriver driver=new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //load the URL
		 driver.get("https://www.amazon.in/");
		 String phone = "oneplus 9 pro";
		 
		 //Search Phone
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @placeholder='Search Amazon.in']")).sendKeys(phone, Keys.ENTER);
		 String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText().trim().replaceAll(",", "");
		 String ratings = driver.findElement(By.xpath("(//i[contains(@class, 'a-icon-popover')]/ancestor::span[contains(@aria-label, 'stars')]/following-sibling::span//span)[1]")).getText();
		 System.out.println("Number of ratings : "+ratings);
		 
		 //Click the text link
		 driver.findElement(By.xpath("(//span[contains(@class, 'a-text-normal')])[2]")).click();
		 
		 //Switch to new window
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> window = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(window.get(1));
		 
		 //Take snap of phone image
		 WebElement findElement = driver.findElement(By.xpath("//div[@id='imgTagWrapperId' and @class='imgTagWrapper']"));
		 takeSnap(findElement);
		 
		 //Add cart and get cart subtotal
		 driver.findElement(By.id("add-to-cart-button")).click();
		 Thread.sleep(3000);
		 String subTotal = driver.findElement(By.xpath("//span[contains(@class, 'sw-subtotal-amount')]//span[@class= 'a-price-whole']")).getText().trim().replaceAll(",", "");
		 System.out.println("Price: "+price + "   SubTotal: "+subTotal);
		 
		 //Verify the price and sub total
		 if(price.equals(subTotal))
			 System.out.println("Amount verified and its Correct");
		 else
			 System.out.println("Subtotal Incorrect, please check");
		 driver.quit();
	}
	public static void takeSnap(WebElement ele) throws IOException {
		File source = ele.getScreenshotAs(OutputType.FILE);
		File dest   = new File("./snap/phone.png");
		FileUtils.copyFile(source, dest);
	}

}
