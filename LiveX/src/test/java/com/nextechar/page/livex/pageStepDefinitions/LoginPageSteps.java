package com.nextechar.page.livex.pageStepDefinitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nextechar.page.livex.Settings.DataSettings;
import com.nextechar.page.livex.pom.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	WebDriver driver=null;
	LoginPage login;
	
	@Given("Browser is Open")
	public void Browser_is_Open() {
		System.out.println("Inside Steps - Browser is Open");

	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	}
	@And("User is on Login Page")
	public void User_is_on_Login_Page() throws IOException
	{
		/* String m=DataSettings.getURL(); */
		driver.get("https://venue.events-nextechar.com/en/login?show=phoenix");
	}
	@When("^User enters(.*)and(.*)$")
	public void User_enters_Username_and_Password(String Username, String Password) throws InterruptedException
	{
		login=new LoginPage(driver);
		login.enterUserName(Username);
		login.enterPassword(Password);
		Thread.sleep(2000);
	}
	@And("User clicks on login button")
	public void User_clicks_on_login_button()
	{
		login.login();
		
	}
	@Then("User Navigated to the Livex Lobby")
	public void User_Navigated_to_the_Livex_Lobby() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.className("lobbyImage")).isDisplayed();
		
	}
}
