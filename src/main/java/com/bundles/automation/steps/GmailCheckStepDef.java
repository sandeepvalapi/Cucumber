package com.bundles.automation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailCheckStepDef {

	@Given("^I am on gmail page$")
	public void i_am_on_gmail_page() throws Throwable {
		System.out.println("i am in gmail page");
	}

	@When("^I enter my username and password and click on signin button$")
	public void i_enter_my_username_and_password_and_click_on_signin_button() throws Throwable {
		System.out.println("I am in login page");
	}

	@Then("^I should be redirected to my dashboard page$")
	public void i_should_be_redirected_to_my_dashboard_page() throws Throwable {
		System.out.println("Dashboard");
	}

}
