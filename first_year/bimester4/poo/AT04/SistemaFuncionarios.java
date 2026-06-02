import java.util.ArrayList;
import java.util.List;

public class SistemaFuncionarios {
    private List<Funcionario> funcionarios;

    public SistemaFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

}
