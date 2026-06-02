public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 120000, 4);
        Carro carro2 = new Carro("Fiat", "Pulse", 2023, 95000);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2020, 500000, 20.0);

        Concessionaria loja = new Concessionaria(10);
        loja.cadastrar(carro1);
        loja.cadastrar(carro2);
        loja.cadastrar(caminhao);

        loja.listar();
    }
}
