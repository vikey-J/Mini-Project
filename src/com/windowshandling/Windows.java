package com.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Windows {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions a=new Actions(driver);
		WebElement top = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
	    a.contextClick(top).build().perform();
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement s = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
	    a.contextClick(s).build().perform();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    WebElement mobile = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
	    a.contextClick(mobile).build().perform();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String s1 : windowHandles) {
	       System.out.println(driver.switchTo().window(s1).getTitle());		
		}
	    String s2="Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
	    for (String s3 : windowHandles) {
	    	if(driver.switchTo().window(s3).getTitle().equalsIgnoreCase(s2)){
	    		break;
	    	}
	    	
			
		}
	
	}

}
