import java.util.ArrayList;

public class Livraria {
    private ArrayList<Livro> livros;

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getId() + " - " + livro.getTitulo());
        }
    }

    public void detalharLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano: " + livro.getAno());
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}
