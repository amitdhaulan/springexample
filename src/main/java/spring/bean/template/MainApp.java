package spring.bean.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"BeanTemplate.xml");
		Car car = (Car)applicationContext.getBean("car");
		System.out.print("Dicky:"+car.getDicky());
		System.out.print("     Fuel:"+car.getFuel());
		System.out.print("     Ignition:"+car.getIgnition());
		System.out.print("     Type:"+car.getType());
		System.out.print("     Wheel:"+car.getWheel());
		System.out.println("\n");
		
		Scooter scooter= (Scooter)applicationContext.getBean("scooter");
		System.out.print("Dicky:"+scooter.getDicky());
		System.out.print("       Fuel:"+scooter.getFuel());
		System.out.print("     Ignition:"+scooter.getIgnition());
		System.out.print("     Type:"+scooter.getType());
		System.out.print("     Wheel:"+scooter.getWheel());
		
	}
}
