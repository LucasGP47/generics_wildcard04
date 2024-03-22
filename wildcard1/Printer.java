package wildcard1;

import java.util.List;

public class Printer {

	public static <T> void printList(List<T> list) {
		for (T element : list) {
			System.out.print(element);
		}
	}
	
}
