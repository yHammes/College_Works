import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        System.out.println("Departamento: " + nome);
        System.out.println("Funcionarios:");

        if (funcionarios.isEmpty()) {
            System.out.println("- Nenhum funcionario cadastrado.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println("- " + funcionario.getNome() + " (" + funcionario.getCargo() + ")");
        }
    }
}
