public class Basquete extends Esporte {

    public int quantidadeCestasTreino;
    public double alturaMediaEquipe;

    Basquete(int quantidadeCestasTreino, double alturaMediaEquipe) {
        super("Basquete", "Hammes", 6);
        this.quantidadeCestasTreino = quantidadeCestasTreino;
        this.alturaMediaEquipe = alturaMediaEquipe;
    }

    @Override
    public String toString() {
        return (
            super.toString() +
            ", quantidadeCestasTreino=" +
            quantidadeCestasTreino +
            ", alturaMediaEquipe=" +
            alturaMediaEquipe +
            "}"
        );
    }
}
