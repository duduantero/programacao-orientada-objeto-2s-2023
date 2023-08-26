package estoque;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        int opcao = 0;
        Estoque estoque = new Estoque();
        
        

        Scanner scanner = new Scanner(System.in);
        while (opcao != 5) {
            System.out.println("1- Adicionar item ao estoque");
            System.out.println("2- Listar itens do estoque");
            System.out.println("3- Atualizar item do estoque");
            System.out.println("4- Remover item do estoque");
            System.out.println("5- Sair ");
            opcao = scanner.nextInt();
            executarOpcao(opcao, scanner,estoque);
        }
        scanner.close();
        System.out.println("Sistema fechado.");
    }

    public static void executarOpcao(int op, Scanner sc, Estoque estoque) {

        switch (op) {
            case 1:
                System.out.println("\n Adicionando item ao estoque\n");
                System.out.println("Informe o ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Informe o nome do item: ");
                String nome = sc.nextLine();
                System.out.println("Informe a quantidade: ");
                int quantidade = sc.nextInt();
                Item i = new Item(id, nome, quantidade);
                estoque.adicionarItem(i);
                break;
            case 2:
                System.out.println("\n Listando itens do estoque\n");
                break;

            case 3:
                System.out.println("\n Atualizar item do estoque\n");
                break;

            case 4:
                System.out.println("Removendo item do estoque");
                break;
        }
    }
}
