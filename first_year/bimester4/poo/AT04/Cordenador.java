public class Cordenador extends Funcionario {
    private double gratificacao;

    public Cordenador(String nome, String cpf, double salarioBase, double gratificacao) {
        super(nome, cpf, salarioBase);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public double calcularSalarioFinal() {
        return getSalarioBase() + gratificacao;
    }

    public void exibirDados() {
        System.out.println(super.toString() + ", Gratificação: " + gratificacao);
    }
}