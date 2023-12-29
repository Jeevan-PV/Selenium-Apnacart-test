package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://main.d2gjsk4mjqc1ii.amplifyapp.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		d.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Proceed to Checkout")).click();
	    WebElement dropdown = d.findElement(By.xpath("//select[@class='custom-select']"));
	    Select ref = new Select(dropdown);
		ref.selectByIndex(1);
		ref.deselectByIndex(1);
		d.close();

	}

}
