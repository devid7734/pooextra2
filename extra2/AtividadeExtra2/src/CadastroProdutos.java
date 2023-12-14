import java.util.ArrayList;
import java.util.Scanner;import java.util.Random;
public class CadastroProdutos {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso.");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtos) {
                produto.mostrarDetalhes();
            }
        }
    }

    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void atualizarProduto(int id, String novoNome, double novoPreco) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setNome(novoNome);
                produto.setPreco(novoPreco);
                System.out.println("Produto atualizado!");
                return;
            }
        }
        System.out.println("Produto não foi encontrado. Erro na atualização.");
    }


}
