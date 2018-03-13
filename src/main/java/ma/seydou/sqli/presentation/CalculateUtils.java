package ma.seydou.sqli.presentation;

public class CalculateUtils {
	
	public static Integer additionner(Integer a, Integer b) {
		return a + b;
	}
	
	public static Integer substractor(Integer a, Integer b) {
		return a - b;
	}
	
	public static Integer multiplier(Integer a, Integer b) {
		return a * b;
	}
	
	public static Integer divider(Integer a, Integer b) {
		return a / b;
	}
	
	public static Integer perform(Integer a, Integer b, String operator) {
		return CalculatorInterface.fromOperator(operator).calculate(a, b);
	}

}
