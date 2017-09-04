package com.bundles.automation.steps;

import cucumber.api.java.en.When;

public class Second {
	@When("^I wait 1 hour$")
	public void waited() {
		System.out.println("Waited one Hour");
	}
}
