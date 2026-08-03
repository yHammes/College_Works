public class SelecaoSulAmericana extends Selecao implements Estatistica {
    protected int copasDisputadas;

    public SelecaoSulAmericana(String nome, String pais, int empates, int derrotas, int vitorias, StatusSelecao status, int copasDisputadas) {
        super(nome, pais, empates, derrotas, vitorias, status);
        this.copasDisputadas = copasDisputadas;
    }

    public int getCopasDisputadas() {
        return copasDisputadas;
    }

    public void setCopasDisputadas(int copasDisputadas) {
        this.copasDisputadas = copasDisputadas;
    }

    @Override
    public int calcularEstatisticas() {
        return ((getVitorias() * 3 + getEmpates()) / getVitorias() + getEmpates() + getDerrotas());
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("País: " + getPais());
        System.out.println("Status: " + getStatus());
        System.out.println("Empates: " + getEmpates());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Títulos Mundiais: " + copasDisputadas);
    }
}
