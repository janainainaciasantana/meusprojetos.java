import java.util.Scanner;
public class VerificarObrigVoto {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
       int idade;
       
       System.out.println("Digite a idade ");
       idade=scanner.nextInt();
       if (idade >=18 && idade  <=70) {
        System.out.println("O eleitor é obrigado a votar");
       }

       if (idade<=15) {
        System.out.println("Naõ precisa votar");
       }

       if ((idade >=16 && idade  <=17) || idade > 70) {
        System.out.println("Voto facutativo");
       }
    }
}


