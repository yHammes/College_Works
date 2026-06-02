public class Gato extends Animal {
    public Gato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void emitirSom() {
        System.out.println("Gato miando...");
    }

    public void mover() {
        System.out.println("Gato andando...");
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
    }
}
