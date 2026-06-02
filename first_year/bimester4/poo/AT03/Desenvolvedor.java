public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.2;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cargo: Desenvolvedor");
        super.exibirDados();
        System.out.println("Bonificação: R$ " + getBonificacao());
    }
}
