package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    createAcc.click();
	    Thread.sleep(2000);
	    WebElement fname = driver.findElement(By.name("firstname"));
	    fname.sendKeys("Viknesh");
	    WebElement surname = driver.findElement(By.name("lastname"));
	    surname.sendKeys("kumar");
	    WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	    email.sendKeys("vikey@gmail.com");
	    WebElement reemail = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	    reemail.sendKeys("vikey@gmail.com");
	    WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	    password.sendKeys("teat@123");
	    WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
	    gender.click();
	    WebElement singIn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		singIn.click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\Screenshot\\error1.png");
        FileUtils.copyFile(source, destination);
        

	                                   
	}

}
