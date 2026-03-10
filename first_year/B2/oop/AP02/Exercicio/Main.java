import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Preço: ");
        float preco = sc.nextInt();
        if (preco < 0) {
            System.out.println("O preço não pode ser negativo! ");
            return  ;
        }
        
        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();
        if (quantidade < 0) {
            System.out.println("O preço não pode ser negativo! ");
            return;
        }

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println(produto.toString());
    }
}