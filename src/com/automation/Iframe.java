package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/frames");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		Thread.sleep(6000);
		
		// Switch using webelement
	WebElement	frameElement=d.findElement(By.xpath("//*[@id='frame1']"));	
	d.switchTo().frame(frameElement);
	
	//switch using index
	
//		d.switchTo().frame(3);		
	String	data=d.findElement(By.id("sampleHeading")).getText();	
	System.out.println("Data in the frame is " + data);	
	d.switchTo().defaultContent();
	d.quit();

	}

}
