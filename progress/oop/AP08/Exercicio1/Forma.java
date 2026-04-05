public abstract class Forma {
    private String nome;
    private String cor;

    protected Forma(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCor() {
        return cor;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Forma[nome=" + nome + ", cor=" + cor + "]";
    }
}
