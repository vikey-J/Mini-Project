package com.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver =new ChromeDriver();
	     driver.get("https://www.amazon.in/");
	     driver.manage().window().maximize();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,2800)","");
	    js.executeScript("window.scrollBy(0,-1800)","");
	    js.executeScript("window.scroll(0,0)", "");
 
	    
	}

}
