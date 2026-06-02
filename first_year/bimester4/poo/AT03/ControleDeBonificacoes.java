public class ControleDeBonificacoes {
    private double totalBonificacoes;

    public void registra(Funcionario funcionario) {
        totalBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalBonificacoes() {
        return totalBonificacoes;
    }
}