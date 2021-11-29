package com.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScript_Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement email = driver.findElement(By.id("email"));
        js.executeScript("arguments[0].value='vikneshsdv@gmailcom'",email);
        WebElement password=driver.findElement(By.name("pass"));
        js.executeScript("arguments[0].value='31102001'",password);
        WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
        js.executeScript("arguments[0].click();",login);
		
	}

}
