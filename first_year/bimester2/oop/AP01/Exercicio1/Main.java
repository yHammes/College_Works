import java.util.*;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Carro exemplo", "Modelo exemplo", 2000);
        Carro carro2 = new Carro("Carro exemplo2", "Modelo exemplo2", 2001);

        System.out.println(carro.exibirDados());
        System.out.println(carro2.exibirDados());
    }
}