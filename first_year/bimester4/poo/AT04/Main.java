public class Main {
    public static void main(String[] args) {
        Funcionario cordenador = new Cordenador("Cordenador", "123.456.789-00", 5000, 1000);
        Funcionario professor = new Professor("Professor", "987.654.321-00", 4000, 1, 10);
        Funcionario tecnico_adminisntrativo = new TecnicoAdministrativo("Técnico Administrativo", "111.222.333-00", 3000, 500);

        SistemaFuncionarios sistema = new SistemaFuncionarios();
        sistema.adicionarFuncionario(cordenador);
        sistema.adicionarFuncionario(professor);
        sistema.adicionarFuncionario(tecnico_adminisntrativo);

        for (Funcionario funcionario : sistema.getFuncionarios()) {
            funcionario.exibirDados();
            System.out.println("Salário Final: " + funcionario.calcularSalarioFinal());
        }
    }
}