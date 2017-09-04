Feature: Belly 

@BareMinimum 
Scenario: a few cukes 
	Given I have 42 cukes in my belly 
	When I wait 1 hour 
	Then my belly should growl 
	
@Bundle 
Scenario Outline: Login Functionality 
	Given user navigates to SOFTWARETESTINGHELP.COM 
	When user logs in using Username as "<user>" and Password "<password>" 
	Then login should be successful 
	
	Examples: 
		| user  | password  |
		| Tom   | password1 |
		| Harry | password2 |
		| Jerry | password3 |
