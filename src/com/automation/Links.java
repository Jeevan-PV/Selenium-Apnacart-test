package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(6000);
		driver.get("https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");
		driver.manage().window().maximize();
		Thread.sleep(16000);
		//count no of links
		List<WebElement> links = driver.findElements(By.tagName("a"));		
	    int	linksCount=links.size();	
	    System.out.println("Total no of links are : "+ linksCount);
	    
	    
	    //print links text
	    
	    for(WebElement link:links) {
	    String	v=link.getText();	    
	    System.out.println(v);
	    }   
	    
		
		driver.quit();
		
	}

}
