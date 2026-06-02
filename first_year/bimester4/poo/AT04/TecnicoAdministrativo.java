public class TecnicoAdministrativo extends Funcionario {
    private double auxilioTransporte;

    public TecnicoAdministrativo(String nome, String cpf, double salarioBase, double auxilioTransporte) {
        super(nome, cpf, salarioBase);
        this.auxilioTransporte = auxilioTransporte;
    }

    public double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public double calcularSalarioFinal() {
        return getSalarioBase() + auxilioTransporte;
    }

    public void exibirDados() {
        System.out.println(super.toString() + ", Auxilio de Transporte: " + auxilioTransporte);
    }
}