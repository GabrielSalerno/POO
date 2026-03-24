package lista_2;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int d = teclado.nextInt();
        int t = teclado.nextInt();
        int l = teclado.nextInt();

        int kmH = d/t;
        int kmL = d/l;

        System.out.printf("%dkm/h\n%dkm/l\n",kmH,kmL);
    }
}
