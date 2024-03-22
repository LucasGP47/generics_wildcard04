package wildcard1;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> listaInt = List.of(1,5,6,7,9,5);
		List<String> listaString = List.of("To","Imprimindo","Strings","Numa","Classe","Generica");
		
		System.out.print("Lista String: ");
		Printer.printList(listaString);
		
		System.out.println("");
		
		System.out.print("Lista int: ");
		Printer.printList(listaInt);
		
	}

}
