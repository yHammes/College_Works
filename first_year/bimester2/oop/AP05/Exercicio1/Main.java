public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Programacao Orientada a Objetos", 60);
        Professor professor = new Professor("Carlos Silva", disciplina);

        professor.exibirDados();
    }
}
