package genericsAt2;

public class Capitulo <T> {
    private String titulo;
    private T conteudo;

    public Capitulo(String titulo, T conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public T getConteudo() {
        return conteudo;
    }
}
