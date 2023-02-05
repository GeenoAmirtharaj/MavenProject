package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 //Opening a Browser
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //load the URL
		 driver.get("https://www.leafground.com/window.xhtml");
		 driver.manage().window().maximize();
		 System.out.println("-------- Click and Confirm new Window opens ---------");
		 System.out.println("Window 1: "+ driver.getTitle());
		 driver.findElement(By.xpath("//span[text()='Open']")).click();
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> window = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(window.get(1));
		 System.out.println("Window 2: "+ driver.getTitle());
		 driver.close();
		 driver.switchTo().window(window.get(0));
		 System.out.println("-------- Find the number of opened tabs ---------");
		 System.out.println("Window 1: "+ driver.getTitle());
		 driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		 windowHandles = driver.getWindowHandles();
		 window 	   = new ArrayList<String>(windowHandles);
		 System.out.println("Number of windows opened are: "+ windowHandles.size());
		 driver.switchTo().window(window.get(1));
		 driver.close();
		 driver.switchTo().window(window.get(2));
		 driver.close();
		 driver.switchTo().window(window.get(0));
		 
		 System.out.println("-------- Close all windows except Primary ---------");
		 driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		 windowHandles = driver.getWindowHandles();
		 window 	   = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(window.get(1));
		 System.out.println("Window 2: "+ driver.getTitle());
		 driver.close();
		 driver.switchTo().window(window.get(2));
		 System.out.println("Window 3: "+ driver.getTitle());
		 driver.close();
		 driver.switchTo().window(window.get(3));
		 System.out.println("Window 4: "+ driver.getTitle());
		 driver.close();
		 driver.switchTo().window(window.get(0));
		 System.out.println("Window 1: "+ driver.getTitle());
		 
		 System.out.println("-------- Wait for 2 new tabs to open ---------");
		 driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		 windowHandles = driver.getWindowHandles();
		 window 	   = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(window.get(1));
		 System.out.println("Window 2: "+ driver.getTitle());
		 driver.close();
		 driver.switchTo().window(window.get(2));
		 System.out.println("Window 3: "+ driver.getTitle());
		 driver.close();
		 driver.switchTo().window(window.get(0));
		 System.out.println("Window 1: "+ driver.getTitle());
		 driver.close();
	}
}