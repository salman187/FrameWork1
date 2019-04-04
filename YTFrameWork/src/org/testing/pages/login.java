package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	WebDriver driver;
	Properties pr;
	public login(WebDriver driver, Properties pr) 
	{
	 this.driver=driver;	
	 this.pr=pr;
	}

	public void signin(String user, String password) throws InterruptedException
	{
		WebElement sign_button= driver.findElement(By.xpath(pr.getProperty("sign_button")));
		sign_button.click();
		Thread.sleep(30000);
		WebElement user1=driver.findElement(By.xpath(pr.getProperty("username")));
		user1.sendKeys("andrew.sin6656@gmail.com");
		WebElement next=driver.findElement(By.xpath(pr.getProperty("Next")));
		next.click();
		Thread.sleep(30000);
		WebElement password1=driver.findElement(By.xpath(pr.getProperty("password")));
		password1.sendKeys("8285480458");
		WebElement sign_in=driver.findElement(By.id("sign_in"));
		sign_in.click();
	}
}
