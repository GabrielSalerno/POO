package lista_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Somatorio {
    static public void main(String[] args){
        int num, somatorio=0;

        Scanner teclado = new Scanner(System.in);
        try{
            System.out.print("Digite um número para entrar no somatório: ");
            num = teclado.nextInt();
            while(num>0){
                somatorio += num;
                System.out.print("Digite um número para entrar no somatório: ");
                num = teclado.nextInt();
            }
        } catch(InputMismatchException e){
            System.out.printf("Entrada inválida.\n");
        }
        System.out.printf("Somatorio: %d",somatorio);
        teclado.close();
    }
}
