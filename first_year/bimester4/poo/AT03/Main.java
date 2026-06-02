public class Main {

    public static void main(String[] args) {
        Funcionario gerente = new Gerente("João", 5000);
        Funcionario secretaria = new Secretaria("Maria", 3000);
        Funcionario desenvolvedor = new Desenvolvedor("Pedro", 4000);
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        controle.registra(gerente);
        controle.registra(secretaria);
        controle.registra(desenvolvedor);

        gerente.exibirDados();
        System.out.println("\n");
        secretaria.exibirDados();
        System.out.println("\n");
        desenvolvedor.exibirDados();
        System.out.println("\n");

        System.out.println(
            "Total de bonificação: R$ " + controle.getTotalBonificacoes()
        );
    }
}
