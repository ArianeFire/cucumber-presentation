package ma.seydou.sqli.presentation;

import org.junit.Assert;

import cucumber.api.java8.En;

public class StepDefs implements En{

	private String whatIsSaid;
	private Helloifier helloifier = new Helloifier();
	
	public StepDefs() {
			
		When("^I start the application$", () ->  whatIsSaid = helloifier.hello());
		
		When("^I login as \"(.*)\" to my computer$", (String login) -> this.whatIsSaid = helloifier.hello(login));
		
		Then("^It should say \"(.*)\"$", message -> Assert.assertEquals(message, whatIsSaid));
	}
}
