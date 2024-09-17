package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	
	//encapsulation = private data + public function
	
	private WebDriver driver;
	
	//initialize the driver
	
	public LoginPage(WebDriver driver) {
		 
		this.driver= driver;
	}
	
	//locators
	private By username= By.id("user-name");
	private By password=By.id("password");
	private By loginButton = By.id("login-button");
	
	//actions or methods
	public void verifyTitle() 
	{
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Swag Labs"),"Test fail: Title is not matched!");
		System.out.println("Test pass: Title is matched!");	
	}
	
	public void verifyURL() 
	{
		String URL=driver.getCurrentUrl();
		Assert.assertTrue(URL.contains("demo"),"Test fail: URL is not Matched!");
		System.out.println("Test pass : URL is matched!");
		
	}
	
	public void verifyLogin(String un,String pass)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"login page is matched! ");
		System.out.println("login Completed");
		
		
	}

}
