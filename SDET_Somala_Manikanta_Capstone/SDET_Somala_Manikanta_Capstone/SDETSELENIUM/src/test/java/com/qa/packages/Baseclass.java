package com.qa.packages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	
	WebDriver driver;
	
	@BeforeSuite
	public void Mani() {
		
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://www.saucedemo.com/");
	
	

}
 public void captureScreenshot(WebDriver driver, String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				"./Screenshots/" + fileName + ".jpg");
		FileUtils.copyFile(source, target);
 }
    @AfterSuite
	 public void teardown() {
		 driver.quit();
 }
}
