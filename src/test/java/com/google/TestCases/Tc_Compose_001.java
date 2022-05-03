package com.google.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.PageObjects.Gmail_Compose;

public class Tc_Compose_001 {
	
	public static WebDriver driver;
	
	
	@BeforeMethod()
     public void setup()	
     
	{
		System.setProperty("webdriver.chrome.driver" , "/home/parth/Browsers/chromedriver"); 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void compose() 
	{
		driver.get("https://mail.google.com/mail/u/0/#inbox?compose=new");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Gmail_Compose gmail_Compose=new Gmail_Compose(driver);
		gmail_Compose.clickComposeBtn();
		gmail_Compose.enterEMailId("abcd@gmail.com");
		gmail_Compose.enterSubject("Incubyte");
		gmail_Compose.enterBody("Automation QA test for incubyte");
		gmail_Compose.clickSendBtn();
		
		
		
	}

}
