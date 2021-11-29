package com.alert;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException, IOException  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	//simple Alert
	
	WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
    simple.click();
    driver.switchTo().alert().accept();
    
    //Confirm Alert 
    
    
    WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
    confirm.click();
    WebElement confirm_Button = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])"));
    confirm_Button.click();
    driver.switchTo().alert().dismiss();
    
    //prompt Alert
    
    WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
    prompt.click();
    WebElement prompt_Button = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
    prompt_Button.click();
    driver.switchTo().alert().sendKeys("VIKNESHKUMAR");
    String text = driver.switchTo().alert().getText();
    System.out.println(text);
    driver.switchTo().alert().accept();
    
    //TakesScreenshot
    
    TakesScreenshot ts=(TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    File destination=new File("C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\Screenshot\\alert.png");
    FileUtils.copyFile(source, destination);
    
    
    
	}


}
