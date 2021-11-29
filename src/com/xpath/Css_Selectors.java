package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selectors {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#email")).sendKeys("vikneshsdv@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("31102001");
		driver.findElement(By.cssSelector("[name='login']")).click();
	}

}
