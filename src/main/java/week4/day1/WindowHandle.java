package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//Opening a Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 //load the URL
		 driver.get("https://www.irctc.co.in/nget/train-search");
		 driver.manage().window().maximize();
		 
		 //Parent window details
		 String parentWindow = driver.getWindowHandle();
		 System.out.println("Parent window title is: "+ driver.getTitle());
		 driver.findElement(By.linkText("FLIGHTS")).click();
		 
		 //Getting all window details
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> windows = new ArrayList<String>(windowHandles);
		 
		 //Switch to child window
		 driver.switchTo().window(windows.get(1));
		 System.out.println("Current window title is: "+ driver.getTitle());
		 
		 //Switch back to parent window and close
		 driver.switchTo().window(parentWindow);
		 driver.close();
		 
		 //Focus to child window
		 driver.switchTo().window(windows.get(1));
		 System.out.println("Final window displaying is: "+ driver.getTitle());
	}

}
