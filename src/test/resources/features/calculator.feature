Feature: Simple Calculator (This Calculator will perform simple operations like (+, -, /, *))
	
	Scenario Outline: Global Scenario
		Given I type number <a> and <b>
		When I perform operation <operation>
		Then It should print <result>
		
	Examples:
		|a		|b		|operation|result|
		|1		|1		|	+	  |	2	 |
		|1		|1		|	-	  |	0	 |
		|1		|1		|	*	  |	1	 |
		|1		|1		|	/	  |	1	 |
		
		