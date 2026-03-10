import java.util.*;

public class Retangulo {
    int largura;
    int altura;
    
    public Retangulo(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }

    public int calcularArea(){
        return (this.largura * this.altura)/ 2;
    }

    public int calcularPerimetro(){
        return 2 * (this.largura + this.altura);
    }

    public String exibirDados() {
        return "largura: " + this.largura + "\nPreço: " + this.altura; 
    }
}