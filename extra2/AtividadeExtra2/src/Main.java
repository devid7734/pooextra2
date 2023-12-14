import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CadastroProdutos cadastroProdutos = new CadastroProdutos();

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    cadastroProdutos.listarProdutos();
                    break;
                case 3:
                    buscarProduto();
                    break;
                case 4:
                    atualizarProduto(scanner, cadastroProdutos);
                    break;
                case 5:
                    System.out.println("Saindo do programa. Tchauzinho!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void exibirMenu() {
        System.out.println("                      ");
        System.out.println("         Menu         ");
        System.out.println("1. Adicionar um produto");
        System.out.println("2. Listar produtos");
        System.out.println("3. Buscar produto por ID");
        System.out.println("4. Atualizar produto por ID");
        System.out.println("5. Sair do programa");
        System.out.println("                      ");
    }

    private static void adicionarProduto() {
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.next();
        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        Produto produto = new Produto(nome, preco);
        cadastroProdutos.adicionarProduto(produto);
    }

    private static void buscarProduto() {
        System.out.println("Digite o ID do produto: ");
        int id = scanner.nextInt();

        Produto produto = cadastroProdutos.buscarProduto(id);
        if (produto != null) {
            produto.mostrarDetalhes();
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void atualizarProduto(Scanner scanner, CadastroProdutos cadastroProdutos) {
        System.out.println("Digite o ID do produto que deseja atualizar: ");
        int id = scanner.nextInt();

        Produto produtoExistente = cadastroProdutos.buscarProduto(id);
        if (produtoExistente != null) {
            try {
                System.out.println("Digite o novo nome do produto: ");
                String novoNome = scanner.nextLine();
                novoNome = scanner.nextLine();

                System.out.println("Digite o novo preço do produto: ");
                double novoPreco = scanner.nextDouble();

                cadastroProdutos.atualizarProduto(id, novoNome, novoPreco);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro!");
                scanner.nextLine();
            }
        } else {
            System.out.println("O produto foi não encontrado.");
        }
    }

}

