import java.util.Scanner;

public class ex03ls01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if(num%2==0){
            System.out.println("É par.");
        } else{
            System.out.println("É impar.");
        }

        teclado.close();
    }
}
