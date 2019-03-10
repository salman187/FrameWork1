package org.testing.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void URL()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Salman\\Desktop\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
     @Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("andrew.sin6656@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8285480458");
		driver.findElement(By.id("passwordNext")).click();
		/*driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8285480458");
		driver.findElement(By.xpath("//span[text()='Next']")).click();*/
		
		Thread.sleep(40000);
		driver.findElement(By.xpath("//span[text()='Trending']")).click();
		
		
	
	}
     
    /* @AfterMethod
	public void close()
	{
		driver.close();
	}
	*/

}
