import java.util.*;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 20);

        int area = retangulo.calcularArea();
        int perimetro = retangulo.calcularPerimetro();
        System.out.println("area: " + String.valueOf(area));
        System.out.println("perimetro: " + String.valueOf(perimetro));
    }
}