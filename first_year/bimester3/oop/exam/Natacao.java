public class Natacao extends Esporte {

    public String tipoPiscina;
    public float temperaturaAgua;

    Natacao(String tipoPiscina, int temperaturaAgua) {
        super("Natacao", "Hammes", 6);
        this.tipoPiscina = tipoPiscina;
        this.temperaturaAgua = temperaturaAgua;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", tipoPiscina=" + tipoPiscina + ", temperaturaAgua=" + temperaturaAgua + "}";
    }
}
