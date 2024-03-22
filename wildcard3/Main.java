package wildcard3;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> listaInt = List.of(1,5,6,7,9,5);
		List<Double> listaDouble = List.of(1.4,8.2,4.6,5.4,7.2);
		
		
		System.out.print("Media usando ints: ");
		Calculator.printList(listaInt);
		
		System.out.println("");
		
		System.out.print("Media usando double: ");
		Calculator.printList(listaDouble);

	}

}
