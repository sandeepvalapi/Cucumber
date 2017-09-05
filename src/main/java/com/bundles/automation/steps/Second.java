package com.bundles.automation.steps;

import cucumber.api.java.en.When;

public class Second {
	@When("^I wait (\\d+) hour$")
	public void waited(int arg) {
		System.out.println("Waited one Hour");
	}
}
