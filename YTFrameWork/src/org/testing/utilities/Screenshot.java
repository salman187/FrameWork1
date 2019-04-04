package org.testing.utilities;

import org.openqa.selenium.WebDriver;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {
	
	public static void takeScreenshot(WebDriver driver, String Path)
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
	}

}
