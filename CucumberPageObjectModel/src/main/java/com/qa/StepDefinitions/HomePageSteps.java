package com.qa.StepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^User opens browser$")
	public void User_opens_browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		TestBase.initilization();
	    
	}

	@Then("^User Navigates Login Page$")
	public void User_Navigates_Login_Page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		loginpage=new LoginPage();
	   String title=loginpage.validateLoginPageTitle();
	   System.out.println(title);
	   //Assert.assertEquals("Free CRM For Any Business: Online Customer Relationship Software", title);
	}

	@Then("^User Enters Username and Password$")
	public void User_Enters_Username_and_Password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	   
	}

	@Then("^User Clicks on Login Buttton$")
	public void User_Clicks_on_Login_Buttton() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   
	}



	@Then("^Validate Home Page Title$")
	public void Validate_Home_Page_Title() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		String homepagetitle=homepage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homepagetitle);
	    
	}

	@Then("^Validate LoggedIn UserName$")
	public void Validate_LoggedIn_UserName() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  System.out.println("Logged in username");
	}



}
