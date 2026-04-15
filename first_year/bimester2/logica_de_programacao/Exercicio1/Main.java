import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > maior) maior = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
            soma += numeros[i];
        }

        double media = soma / 10.0;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.printf("Média dos valores: %.2f%n", media);

        scanner.close();
    }
}
