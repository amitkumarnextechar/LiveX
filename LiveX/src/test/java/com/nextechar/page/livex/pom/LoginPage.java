package com.nextechar.page.livex.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {
	
	@FindBy (xpath = "//*[contains(@class,'Login-sc')]")
	WebElement btn_TopRightlogin;
	@FindBy (name = "email")
	WebElement txt_Username;
	@FindBy(name ="password")
	WebElement txt_Password;
	@FindBy(xpath = "//*[contains(@class,'LoginButton')]")
	WebElement btn_login;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 30);
	}
	
	public void enterUserName(String Username){
		txt_Username.sendKeys(Username);
	}
	
	public void enterPassword(String Password){
		txt_Password.sendKeys(Password);
	}
	
	public void topRightLogin(){
		btn_TopRightlogin.click();
		
	}
	
	public void login() {
		btn_login.click();
	}
	public void loginValidUser(String Username, String Password){
        btn_TopRightlogin.click();
		txt_Username.sendKeys(Username);
		txt_Password.sendKeys(Password);
		btn_login.click();
		
		
	}
}
