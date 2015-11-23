package spring.el;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringExpressionLanguage {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser
				.parseExpression("'Testing Spring Expression Framework'");
		
		
		String message = (String) expression.getValue();
		String message1= (String) expression.getExpressionString();
		System.out.println("getValue " + message);
		System.out.println("getExpressionString " + message1);
	}
}

