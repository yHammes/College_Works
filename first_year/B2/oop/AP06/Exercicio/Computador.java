import java.util.ArrayList;
import java.util.List;

public class Computador {

    private String marca;
    private List<Peca> pecas;

    public Computador(String marca) {
        this.marca = marca;
        this.pecas = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void adicionarPeca(String nomePeca) {
        Peca novaPeca = new Peca(nomePeca);
        pecas.add(novaPeca);
    }

    public void exibirPecas() {
        System.out.println("Computador: " + marca);
        System.out.println("Pecas:");

        if (pecas.isEmpty()) {
            System.out.println("- Nenhuma peca adicionada.");
            return;
        }

        for (Peca peca : pecas) {
            System.out.println("- " + peca.getNome());
        }
    }
}
