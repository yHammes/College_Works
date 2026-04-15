import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Preencha a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        System.out.print("\nDiagonal principal: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrincipal += matriz[i][i];
        }

        System.out.print("\nDiagonal secundária: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][4 - i] + " ");
            somaSecundaria += matriz[i][4 - i];
        }

        System.out.println("\n\nSoma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        scanner.close();
    }
}
