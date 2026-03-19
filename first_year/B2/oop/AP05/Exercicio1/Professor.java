public class Professor {
    private String nome;
    private Disciplina disciplina;

    public Professor(String nome, Disciplina disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        System.out.println("Professor: " + nome);

        if (disciplina != null) {
            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Carga horaria: " + disciplina.getCargaHoraria() + " horas");
        } else {
            System.out.println("Nenhuma disciplina associada.");
        }
    }
}
