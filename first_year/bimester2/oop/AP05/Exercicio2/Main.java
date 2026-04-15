public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Ana Souza", "Analista");
        Funcionario funcionario2 = new Funcionario("Bruno Lima", "Desenvolvedor");

        Departamento departamento = new Departamento("Tecnologia");
        departamento.adicionarFuncionario(funcionario1);
        departamento.adicionarFuncionario(funcionario2);

        departamento.listarFuncionarios();
    }
}
