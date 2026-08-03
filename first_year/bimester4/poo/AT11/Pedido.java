public class Pedido {
    private int _numeroPedido;
    private String _cliente;
    private int _valorCompra;
    private StatusPedidos _status;

    public Pedido(int numero, String nome, int _valorCompra, StatusPedidos status) {
        try {
            _numeroPedido = numero;
            _cliente = nome;
            this._valorCompra = _valorCompra;
            _status = status;
            if (_valorCompra <= 0 || _valorCompra > 50000) {
                throw new IllegalArgumentException("Valor de compra inválido: " + _valorCompra);
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar pedido: " + e.getMessage());
        }
    }

    public int getNumero() {
        return _numeroPedido;
    }

    public String getNome() {
        return _cliente;
    }

    public int getValor() {
        return _valorCompra;
    }

    public StatusPedidos getStatus() {
        return _status;
    }

    public void _exibirDados() {
        System.out.println("Pedido: " + _numeroPedido + " - Cliente: " + _cliente + " - Valor: " + _valorCompra + " - Status: " + _status);
    }

    public void _alterarStatus(StatusPedidos status) {
        _status = status;
    }
}
