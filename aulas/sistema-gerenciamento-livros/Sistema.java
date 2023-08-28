import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        Livraria livraria = new Livraria();
         while (opcao != 4){
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livro");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair ");
            opcao = scanner.nextInt();
            executarOpcao(opcao,scanner,livraria);
        }
         scanner.close();
        System.out.println("Sistema fechado.");
    }
    public static void executarOpcao(int op, Scanner sc, Livraria livraria){
        switch (op){
            case 1:
                System.out.println("Adicionando livro");
                System.out.println("Informe o ID");
                int id = sc.nextInt();
                System.out.println("Informe o Autor");
                String autor=sc.nextLine();
                System.out.println("Informe o Titulo");
                String titulo =sc.nextLine();
                System.out.println("Informe o Ano de Publicação");
                String anoDePublicacao =sc.nextLine();
                Livro l = new Livro(id,autor,titulo,anoDePublicacao);
                livraria.adicionarLivro(l);
                break;
            case 2:
                System.out.println("Listando livros");
                System.out.println(livraria.listarLivros());
                break;
            case 3:
                System.out.println("Detalhar livro");
                System.out.println("Informe o ID");
                int idBusca = sc.nextInt();

                break;
        }
    }
}
