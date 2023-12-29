package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.get("https://demoqa.com/droppable");
		WebElement source = d.findElement(By.id("draggable"));
		WebElement destination = d.findElement(By.id("droppable"));
	    Actions ref = new Actions(d);
	    ref.dragAndDrop(source, destination).build().perform();
	    Thread.sleep(3000);
	    d.quit();
		

	}

}
