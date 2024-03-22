package genericsAt1;

public class Main {
	public static void main (String args[]) {
		
		 Apartamento<String> apartamento = new Apartamento<>();
		
		 apartamento.adicionarItem("sofá");
		 apartamento.adicionarItem("Cadeira");
		 apartamento.adicionarItem("Fogão");
		 apartamento.adicionarItem("Quadro");
		 apartamento.adicionarItem("Aquário");
		 apartamento.adicionarItem("Vaso de flor");
		 apartamento.adicionarItem("Geladeira");
		 
		 apartamento.mostrarOsItens();
	}
}
