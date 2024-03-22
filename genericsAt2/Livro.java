package genericsAt2;

import java.util.ArrayList;
import java.util.List;

public class Livro<T> {
	private String titulo;
	private List<Capitulo <T>> cap;
	
	public Livro(String titulo) {
	     this.titulo = titulo;
	     this.cap = new ArrayList<>();
	}
	
    public void adicionarCapitulo(String tituloCap, T conteudoCap) {
        Capitulo<T> capitulo = new Capitulo<>(tituloCap, conteudoCap);
        cap.add(capitulo);
    } 
    
    public void mostrarLivro() {
    	System.out.println("Livro: " + titulo);
    	System.out.println("Indice: ");
    	System.out.println("------------------------------------------------");
    	for (Capitulo<T> capitulo : cap) {
            System.out.println("Capítulo: " + capitulo.getTitulo());
            System.out.println("Conteúdo: " + capitulo.getConteudo());
            System.out.println("------------------------------------------------");
        }
    }
}
