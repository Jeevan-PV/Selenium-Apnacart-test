package com.automation;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		d.manage().window().maximize();
		
		d.findElement(By.linkText("Top Deals")).click();
		 Set<String> window = d.getWindowHandles();
		  java.util.Iterator<String> it = window.iterator();
		  String parentwindow = it.next();
		  String childwindow = it.next();
		 System.out.println(parentwindow);
		 System.out.println(childwindow);
		 d.switchTo().window(childwindow);
		 d.findElement(By.id("search-field")).sendKeys("Tomato");
		 Thread.sleep(3000);
		 d.close();
		 d.quit();
	}

}
