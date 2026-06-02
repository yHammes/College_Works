public class SistemaPagamento {

	void executarPagamentos() {
        PagamentoBoleto metodo1 = new PagamentoBoleto();
        PagamentoPix metodo2 = new PagamentoPix();
        PagamentoCartao metodo3 = new PagamentoCartao();
        metodo1.realizarPagamento();
        metodo2.realizarPagamento();
        metodo3.realizarPagamento();
	}
}
