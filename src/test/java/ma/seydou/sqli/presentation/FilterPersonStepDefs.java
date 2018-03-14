package ma.seydou.sqli.presentation;

import java.util.List;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import ma.seydou.sqli.presentation.filtre_person.Criteria;
import ma.seydou.sqli.presentation.filtre_person.Person;
import ma.seydou.sqli.presentation.filtre_person.PersonFilterUtils;

public class FilterPersonStepDefs implements En {
	
	private List<Person> persons;
	private Criteria criteria;
	private Integer result;

	public FilterPersonStepDefs() {

		Given("^I have a list of persons:$", (DataTable arg1) -> {
			persons = arg1.asList(Person.class);
		});

		Given("^Following criteria:$", (DataTable arg1) -> {
			criteria = arg1.asList(Criteria.class).get(0);
		});

		When("^I apply the criteria$", () -> {
			result = PersonFilterUtils.applyCriteria(persons, criteria).size();
		});

		Then("^I should have result (\\d+)$", (Integer arg1) -> {
			Assert.assertEquals(result, arg1);
		});
	}

}
