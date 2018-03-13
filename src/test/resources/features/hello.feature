Feature: As a user, I want my computer to say hello to me.

	Scenario: Saying Hello in general
		When I start the application 
		Then It should say "Hello, world"
		
	Scenario: Saying Hello to me
		When I login as "Seydou" to my computer 
		Then It should say "Hello, Seydou"
