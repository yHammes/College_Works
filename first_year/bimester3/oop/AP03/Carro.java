public class Carro extends Veiculo {

    private int qtdRodas;
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int qtdRodas, int numPortas) {
        super(marca, modelo, ano); // chama construtor da classe pai
        this.qtdRodas = qtdRodas;
        this.numPortas = numPortas;
    }

    public Carro(String marca, String modelo, int ano, int qtdRodas) {
        this(marca, modelo, ano, qtdRodas, 4);
    }

    public Carro(String marca, String modelo, int ano) {
        this(marca, modelo, ano, 4, 4);
    }

    public int getQtdRodas() { return qtdRodas; }
    public void setQtdRodas(int qtdRodas) { this.qtdRodas = qtdRodas; }

    public int getNumPortas() { return numPortas; }
    public void setNumPortas(int numPortas) { this.numPortas = numPortas; }

    @Override
    public String toString() {
        return super.toString() +
               " | Rodas: " + qtdRodas +
               " | Portas: " + numPortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== CARRO ===");
        System.out.println(this.toString());
    }

    public void exibirInfo(boolean detalhado) {
        exibirInfo();
        if (detalhado) {
            System.out.println("Tipo: Automóvel de passeio");
            System.out.println("Combustível estimado: Gasolina/Etanol/Flex");
        }
    }
}
