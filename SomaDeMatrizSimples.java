import java.util.Random;

public class SomaDeMatrizSimples {

    public static void main(String[] args) {
        // Definindo o tamanho da matriz
        int linhas = 5;
        int colunas = 5;

        // Criando a matriz e preenchendo com números aleatórios de 1 a 25
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(25) + 1; // números de 1 a 25
            }
        }

        // Imprimindo a matriz no formato 5x5
        System.out.println("Matriz 5x5:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // nova linha para a próxima linha da matriz
        }
    }
}