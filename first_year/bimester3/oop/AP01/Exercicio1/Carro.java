import java.util.*;

public class Carro {
    String marca;
    String modelo;
    int ano;
    
    public Carro(String marca, String modelo , int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String exibirDados() {
        return "marca: " + this.marca + "\nPreço: " + this.modelo + "\nano:" + this.ano; 
    }
}