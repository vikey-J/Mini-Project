package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccFB {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement create_Acc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create_Acc.click();
	Thread.sleep(2000);
	WebElement first = driver.findElement(By.name("firstname"));
	first.sendKeys("Viknesh");
	WebElement surName = driver.findElement(By.name("lastname"));
	surName.sendKeys("kumar");
	WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	email.sendKeys("vikey@gmail.com");
	WebElement reemail = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	reemail.sendKeys("vikey@gmail.com");
	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	password.sendKeys("teat@123");
	WebElement day = driver.findElement(By.id("day"));
	day.sendKeys("31");
	WebElement month = driver.findElement(By.id("month"));
	month.sendKeys("October");
	WebElement year = driver.findElement(By.id("year"));
	year.sendKeys("2001");
	WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
	gender.click();
	WebElement singIn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	singIn.click();
	}
}
