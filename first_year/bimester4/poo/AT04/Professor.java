public class Professor extends Funcionario {
    private int quantidadeaulas;
    private double valorPorAula;

    public Professor(String nome, String cpf, double salarioBase, int quantidadeaulas, double valorPorAula) {
        super(nome, cpf, salarioBase);
        this.quantidadeaulas = quantidadeaulas;
        this.valorPorAula = valorPorAula;
    }

    public int getQuantidadeaulas() {
        return quantidadeaulas;
    }

    public double getValorPorAula() {
        return valorPorAula;
    }

    public double calcularSalarioFinal() {
        return getSalarioBase() + (quantidadeaulas * valorPorAula);
    }

    public void exibirDados() {
        System.out.println(super.toString() + ", Quantidade de Aulas: " + quantidadeaulas + ", Valor por Aula: " + valorPorAula);
    }
}