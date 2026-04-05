public class ContaCorrente extends Conta {
    public double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= limite) {
            super.sacar(valor);
        } else {
            System.out.println("Limite excedido");
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente[" +
                "titular='" + getTitular() + '\'' +
                ", saldo=" + getSaldo() +
                ", limite=" + limite +
                ']';
    }
}
