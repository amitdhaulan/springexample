package spring.el;

import java.util.List;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MethodAccessTest {

	public static void main(String[] args) {

		test1();
		test2();
		test3();
	}

	private static void test1() {

		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser
				.parseExpression("new java.lang.String('Hello')");

		String stringObject = expression.getValue(String.class);
		System.out.println("String object is " + stringObject);
	}

	private static void test2() {

		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("'Find me'.charAt(3)");

		Character character = expression.getValue(Character.class);
		System.out.println("Character at position 4 is " + character);
	}

	private static void test3() {

		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser
				.parseExpression("new java.util.ArrayList()");

		@SuppressWarnings("unchecked")
		List<Integer> numbers = expression.getValue(List.class);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("Numbers list is " + numbers);
	}

}