package com.SwagLabs.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;

public class BaseTest {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		driver.getCurrentUrl();
		lp=new LoginPage(driver);
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}

}
