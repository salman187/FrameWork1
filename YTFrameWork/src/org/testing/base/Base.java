package org.testing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	public Properties pr;

	@BeforeMethod
	public void URL() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Salman\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		File f=new File("C:\\Users\\Salman\\git\\youtube\\YTFrameWork\\OR.properties");
		FileInputStream fi =new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);

}
	/*@AfterMethod
	public void close() throws InterruptedException
	{
    	 Thread.sleep(3000);
		driver.close();
	}*/


}
