package org.testing.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testing.pages.login;
import org.testing.utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

public class TC1 extends Base {
	
	
     @Test
	public void Login() throws InterruptedException
	{
		login l=new login(driver, pr);
		l.signin("andrew.sin6656@gmail.com", "8285480458");
		Screenshot.takeScreenshot(driver, "c://screenshot//first.png");
		
		/*driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8285480458");
		driver.findElement(By.xpath("//span[text()='Next']")).click();*/
		
		Thread.sleep(40000);
		WebElement trending=driver.findElement(By.xpath(pr.getProperty("Trending")));
		trending.click();
		
	
	}
     
     /*@AfterMethod
     
	public void close() throws InterruptedException
	
	{
    	 Thread.sleep(40000);
		driver.close();
	}*/
	

}
