import java.util.*

public class ServicoLimpeza extends Servico implements Executavel {
    public ServicoLimpeza(String nome, int valor_base, PrioridadeServico prioridade) {
        super(nome, valor_base, prioridade);
    }

    public void executar() {
        System.out.println("Executando serviço de limpeza para o cliente: " + getClient_name());
        System.out.println("Valor final do serviço: " + calcularValorFinal());

        exibirDados();
    }

    @Override
    public void exibirDados() {
        System.out.println("Serviço de Limpeza");
        System.out.println("Cliente: " + getClient_name());
        System.out.println("Valor Base: " + getValor_base());
        System.out.println("Prioridade: " + getPrioridade());
    }

    @Override
    public int calcularValorFinal() {
        int valor_final = getValor_base();
        if (getPrioridade() == PrioridadeServico.NORMAL) {
              IntUnaryOperator desconto = v -> (int) (v * 0.9);
            valor_final = desconto.applyAsInt(valor_final);
        }
        return valor_final;
    }
}