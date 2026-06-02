public class PagamentoCartao implements Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Realizando pagamento com cartão");
    }
}