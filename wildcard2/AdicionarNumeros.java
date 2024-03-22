package wildcard2;

import java.util.List;
import java.util.Random;

public class AdicionarNumeros {
	public static <T> void printList(List<Integer> list) {
		Random random = new Random();
		list.add(random.nextInt(11));
		
		for (Integer element : list) {
			System.out.print(element + "; ");
		}
	}
}
