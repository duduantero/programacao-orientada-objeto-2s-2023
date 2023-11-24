    package exemplo.com;

    import java.util.Scanner;

    public class Menu {
        private Scanner scanner = new Scanner(System.in);

        public void exibirMenu() {
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Consultar Livro");
            System.out.println("3. Atualizar Livro");
            System.out.println("4. Excluir Livro");
            System.out.println("5. Cadastrar Revista");
            System.out.println("6. Consultar Revista");
            System.out.println("7. Atualizar Revista");
            System.out.println("8. Excluir Revista");
            System.out.println("9. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            if (opcao == 9) {
                System.out.println("Saindo...");
                System.exit(0); 
            } else {
                processarEntrada(opcao);
            }
        }

        private void processarEntrada(int opcao) {
            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    consultarLivro();
                    break;
                case 3:
                    atualizarLivro();
                    break;
                case 4:
                    excluirLivro();
                    break;
                case 5:
                    cadastrarRevista();
                    break;
                case 6:
                    consultarRevista();
                    break;
                case 7:
                    atualizarRevista();
                    break;
                case 8:
                    excluirRevista();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        private void cadastrarLivro() {
            scanner.nextLine(); 
            System.out.print("Digite o título do livro: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite o autor do livro: ");
            String autor = scanner.nextLine();
            System.out.print("Digite a editora do livro: ");
            String editora = scanner.nextLine();

            Livro livro = new Livro();
            livro.setTitulo(titulo);
            livro.setAutor(autor);
            livro.setEditora(editora);
            livro.cadastrar();

            System.out.println("Livro cadastrado com sucesso!");
        }

        private void consultarLivro() {
            System.out.print("Digite o título do livro para consulta: ");
            String titulo = scanner.nextLine();

            Livro livro = new Livro();
            livro.setTitulo(titulo);
            livro.consultar();
        }

        private void atualizarLivro() {
            System.out.print("Digite o título do livro para atualizar: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite o novo autor do livro: ");
            String autor = scanner.nextLine();
            System.out.print("Digite a nova editora do livro: ");
            String editora = scanner.nextLine();

            Livro livro = new Livro();
            livro.setTitulo(titulo);
            livro.setAutor(autor);
            livro.setEditora(editora);
            livro.atualizar();

            System.out.println("Livro atualizado com sucesso!");
        }

        private void excluirLivro() {
            System.out.print("Digite o título do livro para excluir: ");
            String titulo = scanner.nextLine();

            Livro livro = new Livro();
            livro.setTitulo(titulo);
            livro.excluir();

            System.out.println("Livro excluído com sucesso!");
        }

        private void cadastrarRevista() {
            System.out.print("Digite o título da revista: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite a edição da revista: ");
            String edicao = scanner.nextLine();
            System.out.print("Digite a periodicidade da revista: ");
            String periodicidade = scanner.nextLine();

            Revista revista = new Revista();
            revista.setTitulo(titulo);
            revista.setEdicao(edicao);
            revista.setPeriodicidade(periodicidade);
            revista.cadastrar();

            System.out.println("Revista cadastrada com sucesso!");
        }

        private void consultarRevista() {
            System.out.print("Digite o título da revista para consulta: ");
            String titulo = scanner.nextLine();

            Revista revista = new Revista();
            revista.setTitulo(titulo);
            revista.consultar();
        }

        private void atualizarRevista() {
            System.out.print("Digite o título da revista para atualizar: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite a nova edição da revista: ");
            String edicao = scanner.nextLine();
            System.out.print("Digite a nova periodicidade da revista: ");
            String periodicidade = scanner.nextLine();

            Revista revista = new Revista();
            revista.setTitulo(titulo);
            revista.setEdicao(edicao);
            revista.setPeriodicidade(periodicidade);
            revista.atualizar();

            System.out.println("Revista atualizada com sucesso!");
        }

        private void excluirRevista() {
            System.out.print("Digite o título da revista para excluir: ");
            String titulo = scanner.nextLine();

            Revista revista = new Revista();
            revista.setTitulo(titulo);
            revista.excluir();

            System.out.println("Revista excluída com sucesso!");
        }
    }