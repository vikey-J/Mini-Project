package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Drop_Down {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Java_Project\\ChromeDriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(drop);
		System.out.println("-------------------------------------");
		s.selectByValue("1");
		s.selectByIndex(3);
		s.selectByVisibleText("Loadrunner");

		boolean multiple = s.isMultiple();
		System.out.println(multiple);

		System.out.println("-------------------------------------");

		System.out.println("get all options :");

		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println("  * " + webElement.getText());

		}
		System.out.println("-------------------------------------");

		System.out.println("get all select options :");

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement1 : allSelectedOptions) {
			System.out.println("  * " + webElement1.getText());

		}
		System.out.println("-------------------------------------");

		System.out.println("get first select option :");

		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("  * " + firstSelectedOption.getText());
	}
}
