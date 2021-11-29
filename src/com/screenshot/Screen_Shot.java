package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {
	public static void main (String args[]) throws IOException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement cna = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		cna.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\Screenshot\\error2.png");
		FileUtils.copyFile(source, destination);
		
		
	}
	

}
