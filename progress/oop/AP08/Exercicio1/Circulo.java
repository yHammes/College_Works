public class Circulo extends Forma {
    private static final double PI = Math.PI;
    private double raio;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area() {
        return PI * raio * raio;
    }

    public double perimetro() {
        return 2 * PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo" + "[raio=" + raio + ", area=" + area() + ", perimetro=" + perimetro() + ", cor=" + getCor() + "]";
    }
}
