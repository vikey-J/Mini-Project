package com.mini_Projcet;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.html5.AddApplicationCache;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.javascriptexecutor.JavaScript_Executor;

public class Mini_Project {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	 	WebDriver driver = new ChromeDriver(); // UpCasting
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		// move the mouse to women

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions w = new Actions(driver);
		w.moveToElement(women).build().perform();

		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		dresses.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement cassual_Dresses = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[1]"));
		cassual_Dresses.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// move the mouse to instock

		WebElement instock = driver.findElement(By.xpath("//span[@class='available-now']"));
		w.moveToElement(instock).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement addtocart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		addtocart.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement checkout = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		checkout.click();

		// 1.summary

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// click the + button for 6 times

		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement checkout2 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		checkout2.click();

		// 2.Signin

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("vikey4@gmail.com");

		WebElement create_Acc = driver.findElement(By.id("SubmitCreate"));
		create_Acc.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement mr = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		mr.click();

		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("viknesh");

		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("kumar");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("vikey@123");

		// 3.Address

		WebElement adress_Fn = driver.findElement(By.id("firstname"));
		adress_Fn.sendKeys("viknesh");

		WebElement adress_Ln = driver.findElement(By.id("lastname"));
		adress_Ln.sendKeys("kumar");

		WebElement adress_company = driver.findElement(By.id("company"));
		adress_company.sendKeys("DLF");

		WebElement adress = driver.findElement(By.id("address1"));
		adress.sendKeys("7,DLF road");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");

		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select s = new Select(state);
		s.selectByValue("14");

		WebElement post = driver.findElement(By.id("postcode"));
		post.sendKeys("00000");

		WebElement phoneno = driver.findElement(By.id("phone_mobile"));
		phoneno.sendKeys("9876543210");

		WebElement register = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		register.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement checkout3 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		checkout3.click();

		// 4.Shipping

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement agree = driver.findElement(By.id("cgv"));
		agree.click();

		WebElement checkout4 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		checkout4.click();

		// 5.Payment

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement bank = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		bank.click();

		WebElement confirm = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		confirm.click();

		js.executeScript("window.scrollBy(0,400)", "");

		// TakesScreenshot

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\Screenshot\\miniproject.png");
		FileUtils.copyFile(source, destination);

	}
}
