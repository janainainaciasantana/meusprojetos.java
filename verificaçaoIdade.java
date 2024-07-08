import java.util.Scanner;
public class verificaçaoIdade{
  public static void main(String[]args){
    int idade;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Digite sua idade");
    idade= scanner.nextInt();
    scanner.close();
    if(idade >17){
      System.out.println("Você é um adulto.");
    }else if (idade >12){
      System.out.println("Você é um adolescente.");
    }else {
      System.out.println("Você é uma criança.");
    }
    }
 }
    
  



