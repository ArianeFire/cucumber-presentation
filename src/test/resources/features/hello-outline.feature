Feature: Hello World In Cucumber Using out-line
	
	Scenario Outline: I say hello out line
		When OI login as <login>
		Then OIt should say <greeting>
		
		Examples:
			| login 	| greeting		|
			| Seydou	|Hello, Seydou	|
			| World		|Hello, World	|
			