import java.util.Scanner;// classe responsavel por ler o teclado do  usuario

public class fatorial {
public static void main(String[] args ){
    int numero=0, fat=0;
    // Chama a classe Scanner para dentro do programa
    Scanner scanner = new Scanner(System.in);
     // Pedir para o usuario digitar um numero
     System.out.print("Digite um numero:");

      //Capturar o que o usuario digitar
      numero = scanner.nextInt();

      // Fazer loop para multiplicar os valores do fatorial
      for (int i = numero; i >1; --i){
        fat = fat * i;
        //fat *= i;

      }
      // Exibindo o resultado
      System.out.print("O fatorial de " + numero + " é " + fat);

      scanner.close();
    }
}