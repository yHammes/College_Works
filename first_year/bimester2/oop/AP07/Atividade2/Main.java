public class Main {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.setSetor("Financeiro");
        f.setCargo("Analista");
        f.setEmpresa("AlphaTech");
        f.setSalario(3500.0);

        System.out.println("Setor: " + f.getSetor());
        System.out.println("Cargo: " + f.getCargo());
        System.out.println("Empresa: " + f.getEmpresa());
    }
}
