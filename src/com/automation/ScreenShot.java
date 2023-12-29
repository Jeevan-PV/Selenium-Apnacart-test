package com.automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver d=new ChromeDriver();
	    d.get("https://main.d2gjsk4mjqc1ii.amplifyapp.com/checkout.html");
	    d.manage().window().maximize();
	    
	    File f = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    Files.copy(f,new File("C:\\Users\\HOME PC\\Desktop\\screenshot\\checkout.jpg"));
	    
	    d.quit();
	}

}
