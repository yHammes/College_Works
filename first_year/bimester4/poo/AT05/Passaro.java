public class Passaro extends Animal {
    public Passaro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void emitirSom() {
        System.out.println("Passaro cantando...");
    }

    public void mover() {
        System.out.println("Passaro voando...");
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
    }
}
