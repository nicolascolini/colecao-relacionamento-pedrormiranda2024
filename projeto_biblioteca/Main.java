package projeto_biblioteca;
import projeto_biblioteca.models.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Livro> biblioteca = new ArrayList<>();
        Autor autor1 = new Autor("jorge", "maranhense");
        Autor autor2 = new Autor("mateus", "brasileiro");
        Autor autor3 = new Autor("bolsonaro", "brasileiro");
        Autor autor4 = new Autor("nikolas ferreira", "brasileiro");
        LivroFisico livro1 = new LivroFisico("harry potter", 1997, autor1, 200);
        LivroFisico livro2 = new LivroFisico("senhor dos aneis", 1850, autor2, 201);
        LivroDigital livro3 = new LivroDigital("meu brasil acima de tudo", 2022, autor3, 14.5);
        LivroDigital livro4 = new LivroDigital("como chegar no milhao antes dos 30", 2022, autor3, 14.5);
    }
}
