package ma.seydou.sqli.presentation;

public interface CalculatorInterface {
	Integer calculate(Integer a, Integer b);

	static CalculatorInterface fromOperator(String operator) {
		switch (operator) {
			case "+":
				return CalculateUtils::additionner;
			case "-":
				return CalculateUtils::substractor;
			case "*":
				return CalculateUtils::multiplier;
			case "/":
				return CalculateUtils::divider;
			default:
				throw new RuntimeException(String.format("Bombozled, No such operator '%s' !", operator));
		}
	}
}
