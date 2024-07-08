import java.util.Scanner;
public class SomaDosNumerosImpares{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int contador=1, soma=0,numero;
       while(contador<=5){
        System.out.println("Digite o primeiro numero:");
        numero=scanner.nextInt();
        soma=soma+numero;
contador++;
 } 
    System.out.println ("A soma dos numeros é:"+ soma);

    scanner.close();
    }
}
