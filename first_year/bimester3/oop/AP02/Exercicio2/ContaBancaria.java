import java.util.*;

public class ContaBancaria {
    int numeroConta;
    String titular;
    private int saldo;
    
    public ContaBancaria(int numeroConta, String titular , int saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(int quantia){
        this.saldo += quantia;
    }
    
    public void sacar(int quantia){
        if (this.saldo < quantia) {
            System.out.println("Você não possui saldo suficiente!");
            return;
        }
        this.saldo -= quantia;
    }

    
    public int numeroConta(){
        return this.numeroConta;
    }

    public int saldo(){
        return this.saldo;
    }

    public String titular(){
        return this.titular;
    }

    public String toString() {
        return "NumeroConta: " + this.numeroConta + "\nTitular: " + this.titular + "\nSaldo: " + this.saldo; 
    }
}