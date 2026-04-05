public class Main {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Ana", 200.0, 150.0);
        ContaPoupanca cp = new ContaPoupanca("Bruno", 500.0, 0.02);

        System.out.println("== Conta Corrente ==");
        System.out.println(cc);
        cc.sacar(100.0);
        System.out.println("Apos saque 100: " + cc);
        cc.sacar(160.0);
        System.out.println("Apos tentativa de saque 160: " + cc);
        cc.sacar(150.0);
        System.out.println("Apos tentativa de saque 150: " + cc);
        cc.depositar(80.0, "deposito para cobrir saldo");
        System.out.println("Apos deposito 80: " + cc);

        System.out.println("\n== Conta Poupanca ==");
        System.out.println(cp);
        cp.aplicarJuros(3);
        System.out.println("Apos 3 periodos de juros: " + cp);
    }
}
