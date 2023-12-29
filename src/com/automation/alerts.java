package com.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();	
		d.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		d.manage().window().maximize();
		
		d.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		Alert alert = d.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
           
        d.findElement(By.id("confirmButton")).click();
        Thread.sleep(2500);
        alert.dismiss();
        Thread.sleep(5000);
        
        d.findElement(By.id("confirmButton")).click();
        String v2 = alert.getText();
        System.out.println(v2);
        alert.accept();
        
        d.findElement(By.id("promtButton")).click();
        alert.sendKeys("Jeevan Kumar");
        alert.accept();
        Thread.sleep(2000);
        d.quit();
        
           
		
		
		

	}

}
