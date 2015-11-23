package spring.el;

import java.util.Collection;
import java.util.Iterator;

public class CollectionUtils {
	public static Integer maxElement(Collection collection) {
		Integer maxElement = null;
		@SuppressWarnings("unchecked")
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (maxElement == null) {
				maxElement = integer;
			} else {
				if (integer.intValue() > maxElement.intValue()) {
					maxElement = integer;
				}
			}
		}
		return maxElement;
	}
}
