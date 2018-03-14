package ma.seydou.sqli.presentation.filtre_person;

import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonFilterUtils {
	
	public static BiPredicate<Criteria, Function<Criteria, Object>> nonNullChecker = (criteria, fields) -> Objects.nonNull(criteria) && Objects.nonNull(fields.apply(criteria));

	public static List<Person> applyCriteria(List<Person> persons, Criteria criteria){
		
		BiPredicate<Person, Criteria> criterias = buildFilter(criteria);
		
		return persons.stream().filter(person -> criterias.test(person, criteria)).collect(Collectors.toList());
	}
	
	public static BiPredicate<Person, Criteria> buildFilter(Criteria criteria){
		
		BiPredicate<Person, Criteria> biPreds = (p, c) -> true;
		
		if(PersonFilterUtils.nonNullChecker.test(criteria, Criteria::getName)) {
			biPreds = biPreds.and(new NameFilter());
		}
		
		if(PersonFilterUtils.nonNullChecker.test(criteria, Criteria::getGender)) {
			biPreds = biPreds.and(new GenderFilter());
		}
		
		if(PersonFilterUtils.nonNullChecker.test(criteria, Criteria::getAge)) {
			biPreds = biPreds.and(new AgeFilter());
		}
		
		return biPreds;
	}
}
