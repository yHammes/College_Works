import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Selecao> selecoes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println("Digite o nome: ");
                String nome = scanner.nextLine();

                System.out.println("Digite o pais: ");
                String pais = scanner.nextLine();

                System.out.println("Digite as vitorias: ");
                int vitorias = scanner.nextInt();
                if (vitorias < 0) {
                    throw new IllegalArgumentException("Derrotas não podem ser negativas");
                }

                System.out.println("Digite os empates: ");
                int empates = scanner.nextInt();
                if (empates < 0) {
                    throw new IllegalArgumentException("Derrotas não podem ser negativas");
                }

                System.out.println("Digite as derrotas: ");
                int derrotas = scanner.nextInt();
                if (derrotas < 0) {
                    throw new IllegalArgumentException("Derrotas não podem ser negativas");
                }
                Selecao selecao = new SelecaoEuropeia(nome, pais, empates, derrotas, vitorias, StatusSelecao.CLASSIFICADA, 10);
                selecoes.add(selecao);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                scanner.nextLine();
            }

            System.out.println("\n\n\n\n === COPA DO MUNDO 2026 ===");
            for (Selecao selecao : selecoes) {
                int aproveitamento = ((Estatistica) selecao).calcularEstatisticas();
                if (aproveitamento > 60) {
                    Runnable exibir = () -> {
                        System.out.println("Seleção com aproveitamento maior que 60: " + selecao.getNome() + "%");
                        selecao.exibirDados();
                    };
                    exibir.run();
                }
                System.out.println("Aproveitamento: " + aproveitamento + "%");
                selecao.exibirDados();
                System.out.println("\n\n\n");
            }
        }
    }
}
