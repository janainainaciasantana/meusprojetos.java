import java.util.Scanner;
public class ListaDeNome {

    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        String[] nomes = new String[5];

       
        nomes[0] = "Ana";
        nomes[1] = "João";
        nomes[2] = "Maria";
        nomes[3] = "Pedro";
        nomes[4] = "Carla";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        scanner.close();
    }
}