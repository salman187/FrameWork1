package org.testing.TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void URL()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Salman\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	
	}
	@Test
	public void Login() throws InterruptedException
	{
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input#identifierId")).sendKeys("andrew.sin6656@gmail.com");
		
		driver.findElement(By.cssSelector("div#identifierNext")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("8285480458");
		driver.findElement(By.cssSelector("div#passwordNext")).click();
		Thread.sleep(10000);
		List<WebElement> ls=driver.findElements(By.id("video-title"));
		ls.size();
		Thread.sleep(5000);
		ls.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@aria-label,'like this video along with 28')]")).click();
		
		
		
		
	}

	/*@AfterMethod
	public void Window_close()
	{
		driver.close();
	}*/
}
