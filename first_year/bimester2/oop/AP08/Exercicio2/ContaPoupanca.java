public class ContaPoupanca extends Conta {

    public final double taxaJuros;

    public ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros(int tempo) {
        double novoSaldo = getSaldo() * Math.pow(1 + taxaJuros, tempo);
        depositar(novoSaldo - getSaldo());
    }

    @Override
    public String toString() {
        return "ContaPoupanca[" +
                "titular='" + getTitular() + '\'' +
                ", saldo=" + getSaldo() +
                ", taxaJuros=" + taxaJuros +
                ']';
    }
}
