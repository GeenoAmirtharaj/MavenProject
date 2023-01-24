package week2.day2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Leaf");
		driver.findElement(By.name("reg_email__")).sendKeys("0987654321");
		driver.findElement(By.name("reg_passwd__")).sendKeys("TestLeaf");
		WebElement birthDay   = driver.findElement(By.name("birthday_day"));
		WebElement birthMonth = driver.findElement(By.name("birthday_month"));
		WebElement birthYear  = driver.findElement(By.name("birthday_year"));
		Select day 			  = new Select(birthDay);
		Select month          = new Select(birthMonth);
		Select year           = new Select(birthYear);
		day.selectByVisibleText("4");
		month.selectByVisibleText("Apr");
		year.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[text() = 'Female']/following-sibling::input")).click();
		driver.close();
	}

}
