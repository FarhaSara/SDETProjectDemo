package org.flipkart.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	WebDriver driver;
	
	@Test
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	@Test(priority = 1)
	public void Login() {
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = 2)
	public void SearchText() {
		driver.findElement(By.name("q")).sendKeys("Hello Farhat");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Test(priority = 3)
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
