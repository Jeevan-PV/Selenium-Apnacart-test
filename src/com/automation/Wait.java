package com.automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		d.manage().window().maximize();
	    d.findElement(By.id("timerAlertButton")).click();
	    WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(7));
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = d.switchTo().alert();
	    alert.accept();
	    Thread.sleep(5000);
	    d.quit();
	}

}
