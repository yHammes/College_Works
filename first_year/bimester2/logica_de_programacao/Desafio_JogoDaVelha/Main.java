import java.util.Scanner;

public class Main {
    static char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char jogadorAtual = 'X';
        int jogadas = 0;

        while (true) {
            exibirTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", sua vez.");
            System.out.print("Linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Coluna (0-2): ");
            int coluna = scanner.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }

            if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição já ocupada! Tente novamente.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            if (verificarVencedor(jogadorAtual)) {
                exibirTabuleiro();
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                break;
            }

            if (jogadas == 9) {
                exibirTabuleiro();
                System.out.println("Empate!");
                break;
            }

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    static void exibirTabuleiro() {
        System.out.println("\n  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------");
        }
        System.out.println();
    }

    static boolean verificarVencedor(char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) return true;
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) return true;
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) return true;
        return false;
    }
}
