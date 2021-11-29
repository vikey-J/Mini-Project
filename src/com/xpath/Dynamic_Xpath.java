package com.xpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.myntra.com/men-tshirts");
    driver.manage().window().maximize();
    List<WebElement> original_Price = driver.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span"));
	ArrayList<Integer> a=new ArrayList<Integer>();
    for (int i = 0; i <original_Price.size(); i++) {
		String replaceAll = original_Price.get(i).getText().replaceAll("Rs. ","");
		int parseInt = Integer.parseInt(replaceAll);
        a.add(parseInt);
	}
    int size = a.size();
    System.out.println("size of all product :"+size);
    System.out.println("minimum price in a list :"+Collections.min(a));
	}

}
