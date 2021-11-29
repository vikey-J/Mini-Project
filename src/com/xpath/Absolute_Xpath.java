package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("----------------Java tutorial------------------- ");
		driver.get("https://www.javatpoint.com/java-tutorial");
		WebElement A_xpath = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[6]/div[2]/div[1]/table/tbody/tr/td/h1"));
		System.out.println(A_xpath.getText());
		
		System.out.println("------------------Java MCQ------------------------");
		driver.get("https://www.javatpoint.com/java-mcq");
		WebElement mcq = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[6]/div[2]/div[1]/table/tbody/tr/td/h1"));
	    System.out.println(mcq.getText());
	}
	

}
