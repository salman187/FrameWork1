package org.testing.TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testing.pages.VideoPlay;
import org.testing.pages.login;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 extends Base {

	@Test
	public void Login() throws InterruptedException
	{
		login l=new login(driver, pr);
	
    	l.signin("andrew.sin6656@gmail.com", "8285480458");
    	VideoPlay video=new VideoPlay(driver, pr);
    	video.Video_play();
    	 
		
		WebElement like=driver.findElement(By.xpath(pr.getProperty("Like_button")));
		like.click();
		WebElement subscribe = driver.findElement(By.xpath(pr.getProperty("Subscribe")));
		subscribe.click();
		
		
		
		
		
	}

    /*@AfterMethod
	public void Window_close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}*/

	
	

}
