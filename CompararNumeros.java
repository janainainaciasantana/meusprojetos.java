import java.util.Scanner;
public class CompararNumeros {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Digite o primeiro numero");
        num1= scanner.nextInt();
        System.out.print("Digite o segundo numero");
        num2= scanner.nextInt();
        if(num1> num2){
            System.out.print("numero1 é maior que numero2");

        }else if(num1<num2){
            System.out.print("numero1 é menor que numero2");

        }else if(num1== num2){
            System.out.print("Sao iguais");

        }
        )scanner.close();     

    }  
}