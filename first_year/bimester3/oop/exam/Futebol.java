public class Futebol extends Esporte {

    public String campeonato;
    public int quantidadeTitulares;

    Futebol(String campeonato, int quantidadeTitulares) {
        super("Futebol", "Hammes", 6);
        this.campeonato = campeonato;
        this.quantidadeTitulares = quantidadeTitulares;
    }

    @Override
    public String toString() {
        return (
            super.toString() +
            ", campeonato=" +
            campeonato +
            ", quantidadeTitulares=" +
            quantidadeTitulares +
            "}"
        );
    }
}
