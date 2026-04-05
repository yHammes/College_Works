public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo("Disco", "Vermelho", 3.0);
        Retangulo r = new Retangulo("Retangulo", "Verde", 4.0, 5.0);
        Retangulo s = new Retangulo("Quadrado", "Azul", 2.5);

        System.out.println(c);
        System.out.println("Area: " + c.area() + " | Perimetro: " + c.perimetro());
        System.out.println(r);
        System.out.println("Area: " + r.area() + " | Diagonal: " + r.diagonal());
        System.out.println(s);
        System.out.println("Area: " + s.area() + " | Diagonal: " + s.diagonal());
    }
}
