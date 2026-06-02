import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            ProdutoFisico produto = new ProdutoFisico("Produto", -19.99);
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
