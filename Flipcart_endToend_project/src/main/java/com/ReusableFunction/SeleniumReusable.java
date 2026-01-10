package com.ReusableFunction;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseClass.Library;

public class SeleniumReusable  extends Library{
	
	public SeleniumReusable (WebDriver driver) {
		
		this.driver =driver;
	}
 
	public void EnterValue(WebElement element, String Text) {
		try {
			element.sendKeys(Text);
		}
		catch(Exception e) {
			System.out.println("No such element exception");
		}
	}
	
	public void Click(WebElement element) {
		try {
			element.click();
		}
		catch(Exception e) {
			System.out.println("No such element exception");
	}
}
	public void getTitle() {
		try {
			System.out.println("title of the page");
		}
			catch(Exception e) {
				System.out.println("couldn't get the title");
		}
	}
	
	public void takeScreenshot(String path) {
	    try {
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(source, new File(path));
	    } catch (Exception e) {
	        System.out.println("Screenshot not captured");
	        e.printStackTrace();
	    }
	}

	
	}
