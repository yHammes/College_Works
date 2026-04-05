public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String nome, String cor, double largura, double altura) {
        super(nome, cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(String nome, String cor, double lado) {
        this(nome, cor, lado, lado);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return largura * altura;
    }

    public double diagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }

    @Override
    public String toString() {
        return "Retangulo[largura=" + largura
                + ", altura=" + altura
                + ", area=" + area()
                + ", diagonal=" + diagonal()
                + ", cor=" + getCor()
                + "]";
    }
}
