public class Cachorro extends Animal {
    public Cachorro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void emitirSom() {
        System.out.println("Cachorro latindo...");
    }

    public void mover() {
        System.out.println("Cachorro andando...");
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
    }

    
}
