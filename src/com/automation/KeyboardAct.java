package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver.exe");
		  WebDriver d = new ChromeDriver();
		  d.get("https://parabank.parasoft.com/parabank/index.htm");
		  d.manage().window().maximize();
		  
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys("nandi454545");
		  d.findElement(By.xpath("//input[@name='password']")).sendKeys("Nandi4545454123$");
		  Thread.sleep(6000);
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  Thread.sleep(6000);
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys(Keys.BACK_SPACE);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys("nan");
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys(Keys.ARROW_DOWN);
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys(Keys.ARROW_UP);
		  Thread.sleep(5000);
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys(Keys.PAGE_DOWN);
		  d.close();
		  // contextclick - Right click method
	}

}
