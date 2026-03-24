package lista_2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1 = teclado.nextFloat();
        float num2 = teclado.nextFloat();
        System.out.printf("Soma: %f\n", num1 + num2);
        System.out.printf("Subtração: %f\n", num1 - num2);
        System.out.printf("Multipicação: %f\n", num1 * num2);
        System.out.printf("Divisão: %f\n", num1 / num2);
    }
}
