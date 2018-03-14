package ma.seydou.sqli.presentation.filtre_person;

import java.util.function.BiPredicate;

public class GenderFilter implements BiPredicate<Person, Criteria>{

	@Override
	public boolean test(Person t, Criteria u) {
		return u.getGender().equalsIgnoreCase(t.getGender());
	}

}
