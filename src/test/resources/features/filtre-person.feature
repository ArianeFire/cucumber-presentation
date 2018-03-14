Feature: This feature is mean to filter a list of person based on given Criteria.

	Scenario Outline: Filter Person based on Criteria
		Given I have a list of persons:
			| name	| age	| gender	|
			|Seydou	|	23	| M			|
			|Tata	|	23	| F			|
			|JVM	|	16	| M			|
			|JDK	|	16	| F			|
			|Old M	|	70	| M			|
			|Old W	|	70	| F			|
		
		And Following criteria:
			| name 	| age |  gender	|
			| <name>|<age>|	<gender>|
			
		When I apply the criteria
		Then I should have result <result>
			Examples:
				| name 	| age |  gender	| result 	|
				| Seydou| 23  | M		| 1 		|
				| Tata	| 23  | M		| 0 		|
				| JDK	| 16  | F		| 1 		|