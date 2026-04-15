import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 15; i++) {
            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        double percentualPares = (pares / 15.0) * 100;
        double percentualImpares = (impares / 15.0) * 100;

        System.out.println("\nQuantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.printf("Percentual de pares: %.2f%%%n", percentualPares);
        System.out.printf("Percentual de ímpares: %.2f%%%n", percentualImpares);

        scanner.close();
    }
}
