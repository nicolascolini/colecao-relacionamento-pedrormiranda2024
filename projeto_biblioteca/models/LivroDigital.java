package projeto_biblioteca.models;

public class LivroDigital extends Livro{
    private Double tamanhoArquivo;

    public LivroDigital(String titulo, Integer anoPublicacao, Autor autor, Double tamanhoArquivo) {
        super(titulo, anoPublicacao, autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public Double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(Double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String exibirDetalhes() {
        return super.exibirDetalhes() + "tamanhoArquivo=" + tamanhoArquivo;
    }

    
}
