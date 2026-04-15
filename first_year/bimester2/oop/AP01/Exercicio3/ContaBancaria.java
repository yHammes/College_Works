import java.util.*;

public class ContaBancaria {
    String titular;
    private int saldo;
    
    public ContaBancaria(String titular , int saldo){
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

    public int getSaldo(){
        return this.saldo;
    }

    public String getTitular(){
        return this.titular;
    }
}