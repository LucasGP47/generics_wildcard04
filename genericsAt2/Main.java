package genericsAt2;

public class Main {

	public static void main(String[] args) {
		
		Livro<String> livro1 = new Livro<>("Como não reprovar na matéria, conceitos básicos");
		
		livro1.adicionarCapitulo("Fazendo as atividades", "Sem segredo mano faça as atividades");
		livro1.adicionarCapitulo("Estudando fim de semana", "Sei que é chato mas fazer o que");
		livro1.adicionarCapitulo("Sem vida social", "Não é como se voce tivesse mesmo");
		livro1.adicionarCapitulo("De sorte", "No fim, reze");
		
		livro1.mostrarLivro();
	}

}
