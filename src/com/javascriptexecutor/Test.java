package com.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)","");
		js.executeScript("window.scrollBy(0,-1000)", "");
		js.executeScript("window.scroll(0,0)", "");
		WebElement mobile = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
		js.executeScript("arguments[0].click();",mobile);
		Thread.sleep(2000);
//		driver.findElement(By.xpath(""))
		js.executeScript("arguments[0].scrollintoview", mobile);
		
		
	}
}
