package com.google.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Compose {

	
	WebDriver ldriver;

	public Gmail_Compose(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver , this); 
	}
	
	
	@FindBy(xpath = "//div[@class='T-I T-I-KE L3']")
	WebElement composeBtnElement;
	
	@FindBy(id=":p5")
	WebElement emailElement;
	
	@FindBy(id=":on")
	WebElement subjectElement;
	
	@FindBy(id=":ps")
	WebElement bodyElement;
	
	@FindBy(id=":od")
	WebElement sendBtnElement;
	
	public void clickComposeBtn()
	{
		composeBtnElement.click();
	}	
	
	public void enterEMailId(String id)
	{
		emailElement.sendKeys(id);
	}
	public void enterSubject(String sub) 
	{
		subjectElement.sendKeys(sub);
	}
	
	public void enterBody(String bod) 
	{
		bodyElement.sendKeys(bod);
		
	}
	public void clickSendBtn() 
	{
		sendBtnElement.click();
	}
}
