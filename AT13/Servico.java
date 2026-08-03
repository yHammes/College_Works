public abstract class Servico {
    private String client_name;
    private int valor_base;
    private PrioridadeServico prioridade;

    public Servico(String client_name, int valor_base, PrioridadeServico prioridade) {
        this.client_name = client_name;
        this.valor_base = valor_base;
        this.prioridade = prioridade;
    }

    public String getClient_name() {
        return client_name;
    }

    public int getValor_base() {
        return valor_base;
    }

    public void setValor_base(int valor_base) {
        this.valor_base = valor_base;
    }

    public void setPrioridade(PrioridadeServico prioridade) {
        this.prioridade = prioridade;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public PrioridadeServico getPrioridade() {
        return prioridade;
    }

    public abstract void exibirDados();
    public abstract int calcularValorFinal();
}