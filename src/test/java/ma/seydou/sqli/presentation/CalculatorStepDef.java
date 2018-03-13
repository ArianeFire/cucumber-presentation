package ma.seydou.sqli.presentation;

import org.junit.Assert;

import cucumber.api.java8.En;

public class CalculatorStepDef implements En{

	private Integer a;
	private Integer b;
	private String operator;
	
	public CalculatorStepDef() {
		
		Given("^I type number (\\d+) and (\\d+)$", (Integer arg1, Integer arg2) -> {
			a = arg1;
			b = arg2;
		});

		When("^I perform operation (.*)$", (String operation) -> {
			operator = operation;
		});

		Then("^It should print (\\d+)$", (Integer result) -> {
			Assert.assertEquals(CalculateUtils.perform(a, b, operator), result);
		});
		
	}
	
}
