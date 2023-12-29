package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
			driver.manage().window().maximize();
			// Wait for some time to load the whole web page. 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

			WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']"));

			Select select= new Select(dropdown); //Creating object for dropdown
			//select by index 
			select.selectByIndex(1);
			Thread.sleep(3000);

			//select by value
			select.selectByValue("Ma");
			Thread.sleep(3000);

			//select by visible text
			select.selectByVisibleText("November");
			Thread.sleep(3000);

			//deselect january by index
			select.deselectByIndex(1);
			Thread.sleep(3000);
			System.out.println("Option january deleselcted successfully");

			driver.quit();


	}

}
