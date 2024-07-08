import java.util.Scanner;
public class DiaDaSemana {
    public static void main(String[]args){

        Scanner scanner= new Scanner(System.in);
        int dia;
         String nomeDoDiaDaSemana ="";
        System.out.println("Digite um número de 1 a 7:");
        dia= scanner.nextInt();

        switch(dia){
            case 1:
            nomeDoDiaDaSemana = "Domingo";
            break;
            case 2:
            nomeDoDiaDaSemana = "Segunda-feira";
            break;
            case 3:
            nomeDoDiaDaSemana = "Terça-feira";
            break;
            case 4:
            nomeDoDiaDaSemana ="Quarta-feira";
            break;
            case 5:
            nomeDoDiaDaSemana = "Quinta-feira";
            break;
            case 6:
            nomeDoDiaDaSemana = "Sexta-feira";
            break;
            case 7:
            nomeDoDiaDaSemana = "Sábado";
            break;
            default:
            nomeDoDiaDaSemana ="[Não encontrado!]";

        }
        System.out.println("O nome do dia da semana é correspondente ao número digitado é : "+ nomeDoDiaDaSemana + ".");
         
         scanner.close();
    }
}