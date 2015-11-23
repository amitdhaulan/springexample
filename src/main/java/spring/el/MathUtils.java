package spring.el;

public class MathUtils {
	public static boolean isPrime(Integer number) {

		if (number == 0) {
			return false;
		}

		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				return false;
			} else {
				continue;
			}
		}
		return true;
	}
}
