public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.setNome("Carlos");
        a1.setNota(8.5);

        System.out.println("Nome: " + a1.getNome());
        System.out.println("Nota: " + a1.getNota());
    }
}
