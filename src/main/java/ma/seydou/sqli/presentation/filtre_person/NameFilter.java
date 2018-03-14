package ma.seydou.sqli.presentation.filtre_person;

import java.util.function.BiPredicate;

public class NameFilter implements BiPredicate<Person, Criteria>{

	@Override
	public boolean test(Person t, Criteria u) {
		return u.getName().equalsIgnoreCase(t.getName());
	}

}
