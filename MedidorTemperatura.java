import java.util.Scanner; 

public class MedidorTemperatura {
    public static void main (String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Digite a temperatura atual:");

    Double temp;
    
    temp = scanner.nextDouble();

    scanner.close();
        if (temp<0)  {
            System.out.println("Cuidado!Poderá nevar na sua regiao");
        } else if (temp<=20) {
            System.out.println("Tempo frio! Possibilidades de ventos fortes");
        } else if (temp<=30) {
            System.out.println("Tempo agradável todo o dia");
        } else {
            System.out.println("Calor excessivo! Risco de insolaçao");
        }
    }
}
     