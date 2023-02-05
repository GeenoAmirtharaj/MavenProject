package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//Opening a Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 //load the URL
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		 driver.manage().window().maximize();
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 
		 //Alert
		 Alert alert = driver.switchTo().alert();
		 String str = "Black";
		 alert.sendKeys(str);
		 alert.accept();
		 Thread.sleep(2000);
		 String text = driver.findElement(By.xpath("//button[text()='Try it']/following::p")).getText();
		 if(text.contains(str))
			 System.out.println("Entered String "+ str + " Present");
		 else
			 System.out.println("Entered String not present");
		driver.switchTo().defaultContent();
		driver.close();
	}

}
