package lista_3;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = teclado.nextInt();

        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",i,num,i*num);
        }

        teclado.close();
    }
}
