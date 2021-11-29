package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
//		WebElement single = driver.findElement(By.id("singleframe"));
//		driver.switchTo().frame(single);
//		WebElement single_Text = driver.findElement(By.xpath("//input[@type='text']"));
//	    single_Text.sendKeys("SINGLE FRAME");
//	    Thread.sleep(2000);
//	    driver.switchTo().defaultContent();
//	    Thread.sleep(2000);
		
       WebElement multi = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	   multi.click();
	   WebElement mf1 = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 300px;width:600px'])"));
	   driver.switchTo().frame(mf1);
	   WebElement mf2 = driver.findElement(By.xpath("(//iframe[@style=\"float: left;height: 250px;width: 400px\"])"));
	   driver.switchTo().frame(mf2);
	   WebElement text = driver.findElement(By.xpath("(//input[@type='text'])"));
	   text.sendKeys("MULTI FRAME");
	}
	

}
