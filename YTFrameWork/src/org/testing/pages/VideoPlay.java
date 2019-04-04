package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideoPlay {
	
	WebDriver driver;
	Properties pr;
	
	public VideoPlay(WebDriver driver, Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}

	public void Video_play() throws InterruptedException
	{
		List<WebElement> ls=driver.findElements(By.id("video-title"));
		ls.size();
		Thread.sleep(5000); 
		ls.get(0).click();
	}
}
