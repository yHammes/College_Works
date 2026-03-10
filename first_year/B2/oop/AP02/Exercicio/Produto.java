import java.util.*;

public class Produto {
    String nome;
    float preco;
    int quantidade;
    
    public Produto(String nome, float preco , int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nPreço: " + this.preco + "\nQuantidade:" + this.quantidade; 
    }
}