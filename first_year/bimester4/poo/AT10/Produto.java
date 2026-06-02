public abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco < 0) {
            throw new IllegalArgumentException("Preço negativo");
        }
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws IllegalArgumentException {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço negativo");
        }
        this.preco = preco;
    }
}
