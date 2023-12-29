package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("scroll(0,3200)");
		Thread.sleep(5000);
		d.quit();
	}

}
