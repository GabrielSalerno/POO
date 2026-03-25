package lista_2;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        System.out.printf("Soma: %d\n", num1 + num2);
        System.out.printf("Subtração: %d\n", num1 - num2);
        System.out.printf("Multipicação: %d\n", num1 * num2);
        System.out.printf("Divisão: %d\n", num1 / num2);

        teclado.close();
    }
}
