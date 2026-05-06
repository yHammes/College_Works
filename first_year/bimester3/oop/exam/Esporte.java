public class Esporte {

    private String nomeModalidade;
    private String nomeTreinador;
    private int quantidadeAtletas;

    Esporte(
        String nomeModalidade,
        String nomeTreinador,
        int quantidadeAtletas
    ) {
        this.nomeModalidade = nomeModalidade;
        this.nomeTreinador = nomeTreinador;
        this.quantidadeAtletas = quantidadeAtletas;
    }

    public void registrarTreino(String data) {
        System.out.println(
            "Treino registrado para " +
                data +
                " na modalidade " +
                nomeModalidade
        );
    }

    public void registrarTreino(String data, int duracaoMinutos) {
        System.out.println(
            "Treino registrado para " +
                data +
                " na modalidade " +
                nomeModalidade +
                " com duração de " +
                duracaoMinutos +
                " minutos"
        );
    }

    public void setNomeModalidade(String nomeModalidade) {
        this.nomeModalidade = nomeModalidade;
    }

    public void setNomeTreinador(String nomeTreinador) {
        this.nomeTreinador = nomeTreinador;
    }

    public void setQuantidadeAtletas(int quantidadeAtletas) {
        this.quantidadeAtletas = quantidadeAtletas;
    }

    public String getNomeModalidade() {
        return nomeModalidade;
    }

    public String getNomeTreinador() {
        return nomeTreinador;
    }

    public int getQuantidadeAtletas() {
        return quantidadeAtletas;
    }

    @Override
    public String toString() {
        return (
            "Esporte{nomeModalidade=" +
            nomeModalidade +
            ", nomeTreinador=" +
            nomeTreinador +
            ", quantidadeAtletas=" +
            quantidadeAtletas +
            ", "
        );
    }
}
