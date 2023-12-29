package com.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver  d = new ChromeDriver();
		d.get("https://login.yahoo.com/");
		d.findElement(By.id("login-username")).sendKeys("Jeevan");
		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement Checkbox = d.findElement(By.xpath("//input[@id='persistent']"));
		js.executeScript("arguments[0].click()",Checkbox);
		Thread.sleep(7000);
		d.quit();
		
		
	}

}
