public class PedidoInternacional extends Pedido implements Pagamento {
    public PedidoInternacional(int numero, String nome, int valor, StatusPedidos status) {
        super(numero, nome, valor, status);
    }

    public double _calcular_frete() {
        return getValor() * 0.25;
    }
    
    @Override
    public void realizarPagamento() {
        System.out.println("Realizando pagamento do pedido internacional: " + getNumero());
        System.out.println("Frete: " + _calcular_frete());
        super._alterarStatus(StatusPedidos._PAGO);
    }
}