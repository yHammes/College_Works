public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.15;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cargo: Gerente");
        super.exibirDados();
        System.out.println("Bonificação: R$ " + getBonificacao());
    }
}