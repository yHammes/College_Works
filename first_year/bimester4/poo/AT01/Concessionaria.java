public class Concessionaria {

    private Veiculo[] veiculos;
    private int total;

    public Concessionaria(int capacidade) {
        veiculos = new Veiculo[capacidade];
        total = 0;
    }

    public void cadastrar(Veiculo v) {
        if (total < veiculos.length) {
            veiculos[total] = v;
            total++;
        } else {
            System.out.println("Concessionária cheia!");
        }
    }

    public void listar() {
        System.out.println("=== Veículos Cadastrados ===");
        for (int i = 0; i < total; i++) {
            System.out.println(veiculos[i]);
        }
    }
}
