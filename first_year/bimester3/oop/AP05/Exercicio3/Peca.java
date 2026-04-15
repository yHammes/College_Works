public class Peca {

    private String nome;

    public Peca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome peca: " + this.nome;
    }
}
