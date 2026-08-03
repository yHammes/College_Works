public abstract class Selecao {
    private String nome;
    private String pais;
    private int empates;
    private int derrotas;
    private int vitorias;
    private StatusSelecao status;

    public Selecao(String nome, String pais, int empates, int derrotas, int vitorias, StatusSelecao status) {
        this.nome = nome;
        this.pais = pais;
        this.empates = empates;
        this.derrotas = derrotas;
        this.vitorias = vitorias;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public StatusSelecao getStatus() {
        return status;
    }

    public void setStatus(StatusSelecao status) {
        this.status = status;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public abstract void exibirDados();
}