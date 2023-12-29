package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win64\\chromedriver.exe");
    WebDriver d=new ChromeDriver();
    d.get("https://main.d2gjsk4mjqc1ii.amplifyapp.com/");
    d.manage().window().maximize();
    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    d.findElement(By.xpath("//button[@class='add']/a[@data-name='Tomato']")).click(); //add to cart
    Thread.sleep(5000);
    d.findElement(By.linkText("Cart")).click();
	Thread.sleep(8000);
    String Ename ="Tomato(Fresh)";
    String Aname = d.findElement(By.xpath("//*[text()='Tomato(Fresh)']")).getText();
    System.out.println("Product Name is " + Aname);
    if(Ename.equalsIgnoreCase(Aname))
    	System.out.println("Product Name is matched : Pass");
    	else
    	System.out.println("Product Name is not matched : Failed");
    String ActualPrice  = "200.00";
    String ExpectedPrice = d.findElement(By.xpath("//*[text()=' 200.00']")).getText();
    if(ExpectedPrice.equalsIgnoreCase(ActualPrice))
    	System.out.println("Price is matched");
    else
    	System.out.println("Price is not matched");
    d.quit();
    }
    		
}
