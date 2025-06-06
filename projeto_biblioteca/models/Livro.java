package models;

public class Livro {
    protected String titulo;
    protected Integer anoPublicacao;
    protected Autor autor;
    public Livro(String titulo, Integer anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String exibirDetalhes() {
        return "Livro: titulo=" + titulo + ", anoPublicacao=" + anoPublicacao + ", nome do autor=" + autor.getNome() 
        + ", nacionalidade do autor=" + autor.getNacionalidade() + ",";
    }

    
}
