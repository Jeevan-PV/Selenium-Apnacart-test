package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		  JavascriptExecutor js = (JavascriptExecutor)d;
		  WebElement oil = d.findElement(By.xpath("//*[[text()='Sports, Healthcare & more']"));
		  js.executeScript("arguments[0].scrollIntoView()",oil);
		  Thread.sleep(5000);
		  d.quit();

	}

}
