package lista_2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        System.out.printf("Soma: %.2f\n", (float)(num1 + num2));
        System.out.printf("Subtração: %.2f\n", (float)(num1 - num2));
        System.out.printf("Multipicação: %.2f\n", (float)(num1 * num2));
        System.out.printf("Divisão: %.2f\n", (float)num1 / (float)num2);

        teclado.close();
    }
}
