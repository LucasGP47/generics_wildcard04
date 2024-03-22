package wildcard3;

import java.util.List;

public class Calculator {
	public static <T> void printList(List<? extends Number> list) {
		
		double sum = 0;
		
		for (Number num : list) {
			sum += num.doubleValue();
		}
		
		System.out.print("Media: " + sum / list.size());
		
	}
}
