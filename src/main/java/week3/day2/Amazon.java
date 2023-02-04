package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//Opening a Browser
		ChromeDriver driver=new ChromeDriver();
		 
		 //load the URL
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @placeholder='Search Amazon.in']")).sendKeys("phones");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 List<WebElement> elePrice = driver.findElements(By.className("a-price-whole"));
		 List<Integer> priceList = new ArrayList<Integer>();
		 
		 for (WebElement ele : elePrice) {
			 String str = ele.getText().replaceAll(",", "");
			 if(!str.equals(""))
				 priceList.add(Integer.parseInt(str));
		 }
		 
		 System.out.println(priceList);
		 Collections.sort(priceList);
		 System.out.println("Lowest Price found: "+priceList.get(0));
		 driver.close();
	}

}
