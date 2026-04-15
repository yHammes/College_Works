import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        System.out.println("Matriz 4x4 gerada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        double[] mediaLinhas = new double[4];
        double[] mediaColunas = new double[4];

        for (int i = 0; i < 4; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            mediaLinhas[i] = somaLinha / 4.0;
            mediaColunas[i] = somaColuna / 4.0;
        }

        System.out.println("\nMédia das linhas:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Linha %d: %.2f%n", i, mediaLinhas[i]);
        }

        System.out.println("\nMédia das colunas:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Coluna %d: %.2f%n", i, mediaColunas[i]);
        }

        int maiorLinha = 0;
        int maiorColuna = 0;
        for (int i = 1; i < 4; i++) {
            if (mediaLinhas[i] > mediaLinhas[maiorLinha]) maiorLinha = i;
            if (mediaColunas[i] > mediaColunas[maiorColuna]) maiorColuna = i;
        }

        System.out.printf("%nLinha com maior média: Linha %d (%.2f)%n", maiorLinha, mediaLinhas[maiorLinha]);
        System.out.printf("Coluna com maior média: Coluna %d (%.2f)%n", maiorColuna, mediaColunas[maiorColuna]);
    }
}
