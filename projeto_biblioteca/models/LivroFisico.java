package projeto_biblioteca.models;

public class LivroFisico extends Livro {
    private Integer numeroDePaginas;

    public LivroFisico(String titulo, Integer anoPublicacao, Autor autor, Integer numeroDePaginas) {
        super(titulo, anoPublicacao, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String exibirDetalhes() {
        return super.exibirDetalhes() + " numeroDePaginas=" + numeroDePaginas;
    }

    
}
