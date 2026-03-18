public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2023, 4, 4);
        Carro carro2 = new Carro("Ford", "Mustang", 2022, 4);
        Carro carro3 = new Carro("Fiat", "Uno", 2010);

        carro1.exibirInfo();
        System.out.println();

        carro2.exibirInfo(true);
        System.out.println();

        carro3.exibirInfo();
        System.out.println();

        Moto moto1 = new Moto("Honda", "CB 600", 2021, 2, 600.0);
        Moto moto2 = new Moto("Yamaha", "Factor 150", 2020, 2);
        Moto moto3 = new Moto("Kawasaki", "Ninja 400", 2023);

        moto1.exibirInfo();
        System.out.println();

        moto2.exibirInfo(true);
        System.out.println();

        moto3.exibirInfo();
        System.out.println();

        System.out.println("=== POLIMORFISMO (referência Veiculo) ===");
        Veiculo[] frota = {
            new Carro("Chevrolet", "Onix", 2024, 4, 4),
            new Moto("Suzuki", "GSX-R750", 2023, 2, 750.0),
            new Carro("Volkswagen", "Gol", 2019)
        };

        for (Veiculo v : frota) {
            System.out.println();
        }
    }
}
