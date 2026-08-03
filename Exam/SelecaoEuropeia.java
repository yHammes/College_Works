public class SelecaoEuropeia extends Selecao implements Estatistica {
    protected int titulosMundiais;

    public SelecaoEuropeia(String nome, String pais, int empates, int derrotas, int vitorias, StatusSelecao status, int titulosMundiais) {
        super(nome, pais, empates, derrotas, vitorias, status);
        this.titulosMundiais = titulosMundiais;
    }

    public int getTitulosMundiais() {
        return titulosMundiais;
    }

    public void setTitulosMundiais(int titulosMundiais) {
        this.titulosMundiais = titulosMundiais;
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
        System.out.println("Títulos: " + titulosMundiais);
    }
}
