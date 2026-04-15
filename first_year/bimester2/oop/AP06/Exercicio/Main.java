import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Computador> computadores = new ArrayList<>();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Criar novo computador");
            System.out.println("2 - Adicionar peca a um computador");
            System.out.println("3 - Exibir computador");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Marca do computador: ");
                    String marca = scanner.nextLine();
                    computadores.add(new Computador(marca));
                    System.out.println("Computador criado!");
                    break;
                case "2":
                    if (computadores.isEmpty()) {
                        System.out.println("Nenhum computador cadastrado.");
                        break;
                    }
                    listarComputadores(computadores);
                    System.out.print("Numero do computador: ");
                    int idComputer = Integer.parseInt(scanner.nextLine()) - 1;
                    if (idComputer < 0 || idComputer >= computadores.size()) {
                        System.out.println("Opcao invalida.");
                        break;
                    }
                    System.out.print("Nome da peca: ");
                    String peca = scanner.nextLine();
                    computadores.get(idComputer).adicionarPeca(peca);
                    System.out.println("Peca adicionada!");
                    break;
                case "3":
                    if (computadores.isEmpty()) {
                        System.out.println("Nenhum computador cadastrado.");
                        break;
                    }
                    listarComputadores(computadores);
                    System.out.print("Numero do computador: ");
                    int idxExib = Integer.parseInt(scanner.nextLine()) - 1;
                    if (idxExib < 0 || idxExib >= computadores.size()) {
                        System.out.println("Opcao invalida.");
                        break;
                    }
                    computadores.get(idxExib).exibirPecas();
                    break;
                case "0":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }

    static void listarComputadores(List<Computador> computadores) {
        System.out.println("Computadores:");
        for (int i = 0; i < computadores.size(); i++) {
            System.out.println(
                (i + 1) + " - " + computadores.get(i).getMarca()
            );
        }
    }
}
