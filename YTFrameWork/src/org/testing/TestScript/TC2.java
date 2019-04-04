package org.testing.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testing.pages.login;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends Base {
	
	
     @Test
	public void Login() throws InterruptedException
	{
    	 login l=new login(driver, pr);
    	 l.signin("andrew.sin6656@gmail.com", "8285480458");
    	 
		WebElement subscription=driver.findElement(By.xpath(pr.getProperty("//span[text()='Subscriptions']")));
		subscription.click();
		
	
	}
     
     /*@AfterMethod
	public void close() throws InterruptedException
	{
    	 Thread.sleep(3000);
		driver.close();
	}*/
	

}
