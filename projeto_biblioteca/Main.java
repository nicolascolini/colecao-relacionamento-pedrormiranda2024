import models.*;
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
        LivroDigital livro4 = new LivroDigital("como chegar no milhao antes dos 30", 2022, autor4, 14.5);

        biblioteca.add(livro1);
        biblioteca.add(livro2);
        biblioteca.add(livro3);
        biblioteca.add(livro4);
        
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println(biblioteca.get(i).exibirDetalhes());
        }
    }
}
