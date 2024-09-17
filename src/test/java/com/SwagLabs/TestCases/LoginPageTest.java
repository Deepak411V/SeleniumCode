package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

import com.SwagLabs.Pages.LoginPage;

public class LoginPageTest extends BaseTest{
  @Test(priority = 3)
  public void verifyApplicationURl() 
  {
	  LoginPage lp = new LoginPage(driver);
	  lp.verifyURL();
  }
  
  @Test(priority = 2)
  public void verifyApplicationTitle() 
  {
	  lp.verifyTitle();
  }
  @Test(priority = 1)
  public void verifyApplicationLogin() 
  {
	  lp.verifyLogin("standard_user","secret_sauce");
  }
  
  
  
}



