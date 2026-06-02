public class ProdutoFisico extends Produto implements Vendavel {
    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }   

    public String getNome() {
        return super.getNome();
    }

    public double getPreco() {
        return super.getPreco();
    }

    public void setPreco(double preco) {
        super.setPreco(preco);
    }
}
