import java.util.Scanner;

public class Sistema {
    private Livraria livraria;

    public Sistema() {
        this.livraria = new Livraria();
    }

    public void cadastrarLivro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID do livro:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Para consumir a quebra de linha após o próximoInt()
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();
        System.out.println("Digite o ano do livro:");
        int ano = scanner.nextInt();
        Livro livro = new Livro(id, titulo, autor, ano);
        livraria.cadastrarLivro(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void listarLivros() {
        livraria.listarLivros();
    }

    public void detalharLivro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID do livro:");
        int id = scanner.nextInt();
        livraria.detalharLivro(id);
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    sistema.cadastrarLivro();
                    break;
                case 2:
                    sistema.listarLivros();
                    break;
                case 3:
                    sistema.detalharLivro();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
        scanner.close();
    }
}
