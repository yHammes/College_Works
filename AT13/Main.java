import java.util.*;

public class Main {
    public static void main(String[] args) {
        int valor = 1000;
        try {
            if (valor == 0 || valor > 10000) {
                throw new IllegalArgumentException("Valor base do serviço não pode ser zero ou maior que 10000.");
            }
            
            ServicoLimpeza servicoLimpeza = new ServicoLimpeza("João", valor, PrioridadeServico.NORMAL);
            ServicoManutencao servicoManutencao = new ServicoManutencao("Maria", valor, PrioridadeServico.URGENTE);
            
            servicoLimpeza.executar();
            System.out.println();
            servicoManutencao.executar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}