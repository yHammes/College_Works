public class PedidoNacional extends Pedido implements Pagamento {
    public PedidoNacional(int numero, String nome, int valor, StatusPedidos status) {
        super(numero, nome, valor, status);
    }

    public double _calcular_frete() {
        return getValor() * 0.10;
    }
    
    @Override
    public void realizarPagamento() {
        System.out.println("Realizando pagamento do pedido nacional: " + getNumero());
        System.out.println("Frete: " + _calcular_frete());
        super._alterarStatus(StatusPedidos._PAGO);
    }
}