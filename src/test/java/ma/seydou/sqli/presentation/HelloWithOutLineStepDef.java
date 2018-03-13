package ma.seydou.sqli.presentation;

import org.junit.Assert;

import cucumber.api.java8.En;

public class HelloWithOutLineStepDef implements En{
	

	private String whatIsSaid;
	private Helloifier helloifier = new Helloifier();
	
	public HelloWithOutLineStepDef() {
		
		When("^OI login as (.*)$", (String login) -> {
			this.whatIsSaid = helloifier.hello(login);
		});

		Then("^OIt should say (.*)$", (String greeting) -> {
			Assert.assertEquals(whatIsSaid, greeting);
		});
		
	}
}
