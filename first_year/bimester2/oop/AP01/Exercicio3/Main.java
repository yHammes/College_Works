import java.util.*;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Marcio", 1000);
        conta.depositar(500);
        conta.sacar(1400);
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
    }
}