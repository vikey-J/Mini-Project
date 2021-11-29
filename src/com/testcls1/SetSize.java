package com.testcls1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
     //setSize
//     Dimension d=new Dimension(500,500);
//     driver.manage().window().setSize(d);
     //setPosition
     Point p=new Point(100,200);
     driver.manage().window().setPosition(p);
     
	}

}
