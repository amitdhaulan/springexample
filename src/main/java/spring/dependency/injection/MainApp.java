package spring.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		SpellChecker spellChecker = new SpellChecker();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"DependencyInjectionBean.xml");
		TextEditor editor = (TextEditor) applicationContext
				.getBean("texteditor");
		editor.setSpellChecker(spellChecker);
		SpellChecker checker = editor.getSpellChecker();
		checker.checkSpelling();
		
	}
}
