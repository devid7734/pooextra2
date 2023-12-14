import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Produto {
    private static final Random geradorIds = new Random();

    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.id = geradorIds.nextInt(1000); // Exemplo: IDs entre 0 e 999
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarDetalhes() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Preço: " + preco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}