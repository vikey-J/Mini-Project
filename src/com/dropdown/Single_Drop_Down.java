package com.dropdown;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javafx.beans.property.SetProperty;

public class Single_Drop_Down {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement cna = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		cna.click();
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Viknesh");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("kumar");
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		email.sendKeys("739585593");
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("vikey123");
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("31");
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(9);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2001");
		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		gender.click();
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\Screenshot\\scrnst.png");
		FileUtils.copyFile(source, destination);
	}
}
