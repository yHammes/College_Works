public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco(1000);
        try {
            banco.sacar(10000);
            System.out.println("Saldo: " + banco.getSaldo());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
