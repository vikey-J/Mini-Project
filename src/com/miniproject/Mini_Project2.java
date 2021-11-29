package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Mini_Project2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		
		//login
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("vikneshkumar");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("VCVM24");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Search Hotel
		
		WebElement location = driver.findElement(By.id("location"));
		Select l=new Select(location);
		l.selectByValue("New York");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select h=new Select(hotel);
		h.selectByValue("Hotel Sunshine");
		
		WebElement roomtypes = driver.findElement(By.id("room_type"));
		Select r=new Select(roomtypes);
		r.selectByValue("Double");
		
		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select r2=new Select(rooms);
		r2.selectByValue("2");
		
		WebElement date1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		date1.sendKeys("22/11/2021");
		
		WebElement date2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		date2.sendKeys("24/11/2021");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select a=new Select(adult);
		a.selectByValue("3");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select c=new Select(child);
		c.selectByValue("2");
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// Select hotel
		
		WebElement agree = driver.findElement(By.xpath("//input[@type='radio']"));
		agree.click();
		
		WebElement continuee = driver.findElement(By.id("continue"));
		continuee.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// Book a Hotel
		
		WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		fname.sendKeys("VIKNESH");
		
		WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		lname.sendKeys("KUMAR");
		
		WebElement adress = driver.findElement(By.id("address"));
		adress.sendKeys("no.17a,Avengers Tour,New York");
		
		WebElement credit_Card = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		credit_Card.sendKeys("9876123405467744");
		
		WebElement cc_Type = driver.findElement(By.id("cc_type"));
		Select cc=new Select(cc_Type);
		cc.selectByValue("MAST");
		
		WebElement exp_Month = driver.findElement(By.id("cc_exp_month"));
		Select exp=new Select(exp_Month);
		exp.selectByValue("10");
		
		WebElement exp_Year = driver.findElement(By.id("cc_exp_year"));
		Select exp2=new Select(exp_Year);
		exp2.selectByValue("2022");
		
		WebElement ccv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		ccv.sendKeys("9876");
		
		WebElement booknow = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		booknow.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Booking Confirmation
		
		WebElement logout = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
		logout.click();
		
		// Take Screenshot output
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\Screenshot.miniproject2.png");
		FileUtils.copyFile(source, destination);
				
		
		
	}

}
