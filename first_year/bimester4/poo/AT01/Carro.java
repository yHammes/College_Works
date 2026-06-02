public class Carro extends Veiculo {

    private int numeroPortas;

    public Carro(
        String marca,
        String modelo,
        int ano,
        double preco,
        int numeroPortas
    ) {
        super(marca, modelo, ano, preco);
        this.numeroPortas = numeroPortas;
    }

    public Carro(String marca, String modelo, int ano, double preco) {
        super(marca, modelo, ano, preco);
        this.numeroPortas = 4;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularIPVA() {
        return getPreco() * 0.4;
    }

    @Override
    public String toString() {
        return (
            "Carro{" +
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
            ", numeroPortas=" +
            numeroPortas +
            '}'
        );
    }
}
