public class Banco {
    private int saldo;

    public Banco(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int valor) {
        saldo += valor;
    }

    public void sacar(int valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor inválido");
        }
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            throw new Exception("Saldo insuficiente");
        }
    }
}