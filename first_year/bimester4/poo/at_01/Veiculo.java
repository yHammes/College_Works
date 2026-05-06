public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public Veiculo() {}

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularIPVA() {
        return preco * 0.1;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
        System.out.println("IPVA: " + calcularIPVA());
    }

    public String toString() {
        return (
            "Veiculo{" +
            "marca='" +
            marca +
            '\'' +
            ", modelo='" +
            modelo +
            '\'' +
            ", ano=" +
            ano +
            ", preco=" +
            preco +
            '}'
        );
    }
}
