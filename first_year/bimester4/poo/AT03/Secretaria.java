public class Secretaria extends Funcionario {
    public Secretaria(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.12;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cargo: Secretária");
        super.exibirDados();
        System.out.println("Bonificação: R$ " + getBonificacao());
    }
}