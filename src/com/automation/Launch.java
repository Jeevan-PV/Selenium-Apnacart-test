package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://main.d2gjsk4mjqc1ii.amplifyapp.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		d.findElement(By.id("username")).sendKeys("Jeevan123");
		Thread.sleep(5000);
		d.findElement(By.id("password")).sendKeys("Admin125");
		Thread.sleep(5000);
		d.close();
		d.quit();

	}

}
