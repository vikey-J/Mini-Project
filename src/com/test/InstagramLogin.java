package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("thenral96");
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("vikey2000j");
	WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])"));
	login.click();
	}

}
