package lista_2;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        if((num1>num2 && num1<num3)||(num1<num2 && num1>num3))
            System.out.printf("%d no intervalo .",num1);
        else if(num1<num2 && num1<num3)
            System.out.printf("%d está antes do intervalo.\n",num1);
        else
            System.out.printf("%d está depois do intervalo.\n",num1);

        teclado.close();
    }
}
