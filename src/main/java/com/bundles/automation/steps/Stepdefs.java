package com.bundles.automation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import skeleton.Belly;

public class Stepdefs {
	@Given("^I have (\\d+) cukes in my belly$")
	public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
		Belly belly = new Belly();
		belly.eat(cukes);
		System.out.println("I have cukes in my belly - " + cukes);
	}

	@Then("^my belly should growl$")
	public void growmore() {
		System.out.println("Grow more");
	}

	@Given("^user navigates to SOFTWARETESTINGHELP.COM$")
	public void navigatePage() {
		System.out.println("Cucumber executed Given statement");
	}

	@When("^user logs in using Username as \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void login(String user, String password) {
		// DB
		System.out.println("Username : " + user);
		System.out.println("Password: " + password);
	}

	@When("^click the Submit button$")
	public void clickTheSubmitButton() {
		System.out.println("Executing When statement");
	}

	@Then("^Home page should be displayed$")
	public void validatePage() {
		System.out.println("Executing Then statement");
	}

	@Then("^login should be successful$")
	public void validateLoginSuccess() {
		System.out.println("Login method called...");
	}
}
