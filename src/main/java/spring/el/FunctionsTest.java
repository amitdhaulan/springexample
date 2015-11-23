package spring.el;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class FunctionsTest {
	public static void main(String[] args) throws Exception {

		ExpressionParser parser = new SpelExpressionParser();

		StandardEvaluationContext context = new StandardEvaluationContext();
		Method method = null;
		Expression expression = null;
		Boolean value = null;

		// Register the method isPrime()
		method = MathUtils.class.getMethod("isPrime", Integer.class);
		context.registerFunction("prime", method);

		expression = parser.parseExpression("#prime(7)");
		value = expression.getValue(context, Boolean.class);
		System.out.println("Number 7 is prime: " + value);

		expression = parser.parseExpression("#prime(37)");
		value = expression.getValue(context, Boolean.class);
		System.out.println("Number 37 is prime: " + value);

		// Register the method maxElement()
		method = CollectionUtils.class
				.getMethod("maxElement", Collection.class);
		context.registerFunction("max", method);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(43);
		arrayList.add(45);
		arrayList.add(98);
		arrayList.add(32);
		arrayList.add(1);
		String array = arrayList.toString().replace("[", "{").replace("]", "}");

/*		expression = parser.parseExpression("#max({10, 43, 45, 98, 32, 1})");*/
		expression = parser.parseExpression("#max"+array);
		Integer maxElement = expression.getValue(context, Integer.class);
		System.out.println("Max element in the list is : " + maxElement);
	}
}
