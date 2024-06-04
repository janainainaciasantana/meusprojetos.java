public class vgfjh {
    public static void main(String[]args){
        int quantidade = 0;
         for(int contador=1; contador<100; contador++){
            if (contador % 2 == 1) {
                System.out.println(contador);
                quantidade++;
            }
        } 
        System.out.println("Existem "+ quantidade + " numeros impares de 0 a 100");
    }
}
