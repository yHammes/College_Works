public class Caminhao extends Veiculo {

    private double capacidadeCarga;

    public Caminhao(
        String marca,
        String modelo,
        int ano,
        double preco,
        double capacidadeCarga
    ) {
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularIPVA() {
        return getPreco() * 0.2;
    }

    @Override
    public String toString() {
        return (
            "Caminhao{" +
            "marca='" +
            getMarca() +
            '\'' +
            ", modelo='" +
            getModelo() +
            '\'' +
            ", ano=" +
            getAno() +
            ", preco=" +
            getPreco() +
            ", capacidadeCarga=" +
            capacidadeCarga +
            '}'
        );
    }
}
