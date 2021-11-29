package com.revise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revise2 {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
//	WebElement email = driver.findElement(By.id("email"));
//	email.sendKeys("vikneshsdv@gmail.com");
//    WebElement pass = driver.findElement(By.name("pass"));	
//	pass.sendKeys("31102001");
//	WebElement login = driver.findElement(By.name("login"));
//	login.click();
	WebElement cna = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	cna.click();
	Thread.sleep(3000);
	WebElement fname = driver.findElement(By.name("firstname"));
	fname.sendKeys("viknesh");
	WebElement lname = driver.findElement(By.name("lastname"));
	lname.sendKeys("kumar");
	WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	email.sendKeys("vikey@gmail.com");
	}

}
