package spring.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		final Logger log = Logger.getLogger(MainApp.class.getName());

		try {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"Beans.xml");

			HelloWorld helloworld = (HelloWorld) applicationContext
					.getBean("helloworld");
			helloworld.setMessage("my first message");
			System.out.println("Configured spring successfully ==> "
					+ helloworld.getMessage());

			System.out.println("\n");
			HelloWorld helloWorld2 = (HelloWorld) applicationContext
					.getBean("helloworld");

			System.out.println("Configured spring successfully ==> "
					+ helloWorld2.getMessage());

			((AbstractApplicationContext) applicationContext)
					.registerShutdownHook();
		} catch (Exception exception) {
			log.log(Level.WARNING, exception.toString(), exception);
			System.out.println("Exception generated");
		}

	}
}
