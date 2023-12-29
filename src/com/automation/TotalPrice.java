package com.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;


public class TotalPrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.get("https://main.d2gjsk4mjqc1ii.amplifyapp.com/");                         //url
	    d.manage().window().maximize();                                               //maximise windows
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));                  //delay - duration
	    d.findElement(By.xpath("//a[@data-name='Cabbage']")).click();
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//a[@data-name='Cabbage']")).click();                    //add to cart
	    Thread.sleep(5000);
	    d.findElement(By.linkText("Cart")).click();
	    String Ename ="Cabbage(Fresh)";
	    String Aname = d.findElement(By.xpath("//*[text()='Cabbage(Fresh)']")).getText();
	    System.out.println("Product Name is " + Aname);
	    if(Ename.equalsIgnoreCase(Aname))
	    	System.out.println("Product Name is matched : Pass");
	    	else
	    	System.out.println("Product Name is not matched : Failed");
	    String TotalPrice  = "80.00";
	    String ExpectedTotalPrice = d.findElement(By.xpath("//*[text()=' 80.00']")).getText();
	    if(ExpectedTotalPrice.equalsIgnoreCase(TotalPrice)) {
	    	System.out.println("Sub Total Price is matched");
	    }
	    else {
	    	System.out.println("Sub Total Price is not matched");
	    }
	
	
	   d.findElement(By.xpath("//input[@name='quantity_1']")).sendKeys("12");
	   d.findElement(By.linkText("Proceed to Checkout")).click();
	   d.findElement(By.id("fname")).sendKeys("Jeevan");
	   d.findElement(By.id("lname")).sendKeys("Kumar");
	   d.findElement(By.id("email")).sendKeys("jeevan@gmail.com");
	   d.findElement(By.id("phone")).sendKeys("9742321969");
       
	   d.findElement(By.id("address")).sendKeys("No 127 , Malathi Nivas, K R puram");
	   
	   WebElement dropdown = d.findElement(By.xpath("//select[@class='custom-select']"));
	   Select ref = new Select(dropdown);
	   ref.selectByIndex(1);
	   Thread.sleep(3000);
	   d.findElement(By.id("area")).sendKeys("K R Puram");
	   d.findElement(By.id("zip")).sendKeys("560067");
	   d.findElement(By.xpath("//label[@for='cash-on-delivery']")).click();
	   Thread.sleep(4000);
	   d.findElement(By.id("place_order")).click();
	   Thread.sleep(4000);
	   d.quit();
	}
	}
	
