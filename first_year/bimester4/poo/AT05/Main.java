import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Passaro("Pato", 2, 0.5));
        animais.add(new Cachorro("Cachorro", 3, 1.0));
        animais.add(new Gato("Gato", 1, 0.3));

        for (Animal animal : animais) {
            animal.exibirDados();
            animal.emitirSom();
            animal.mover();
        }

    }
}
