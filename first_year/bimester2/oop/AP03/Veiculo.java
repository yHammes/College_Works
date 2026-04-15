public class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    @Override
    public String toString() {
        return "Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano;
    }

    public void exibirInfo() {
        System.out.println("=== VEÍCULO ===");
        System.out.println(this.toString());
    }
}
