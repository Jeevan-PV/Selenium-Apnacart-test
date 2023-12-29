package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signuo {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win64\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://main.d2gjsk4mjqc1ii.amplifyapp.com/");
	d.manage().window().maximize();
	Thread.sleep(3000);
	d.findElement(By.linkText("Signup")).click();
	Thread.sleep(3000);
	d.findElement(By.id("user id")).sendKeys("jeevan123");
	Thread.sleep(1000);
	d.findElement(By.id("phone")).sendKeys("9742321969");
	Thread.sleep(1000);
	d.findElement(By.id("email")).sendKeys("jeevan@gmail.com");
	Thread.sleep(1000);
	d.findElement(By.id("password")).sendKeys("jeevan@123");
	Thread.sleep(1000);
	d.findElement(By.id("confirm-password")).sendKeys("jeevan@123");
	Thread.sleep(1000);
	d.close();
	d.quit();
}
}
