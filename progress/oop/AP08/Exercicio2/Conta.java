public class Conta {

    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void sacar(double value) {
        if (value <= saldo) {
            this.saldo = this.saldo - value;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double value) {
        if (value > 0) {
            this.saldo = this.saldo + value;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void depositar(double value, String description) {
        this.saldo = this.saldo + value;
        System.out.println("Deposito de " + value + " realizado. " + description);
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta[" + "titular='" + titular + '\'' + ", saldo=" + saldo + ']';
    }
}
