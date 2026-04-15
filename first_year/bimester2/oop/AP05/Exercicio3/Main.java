public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell");

        computador.adicionarPeca("Processador");
        computador.adicionarPeca("Memoria RAM");
        computador.adicionarPeca("SSD");

        computador.exibirPecas();
    }
}
