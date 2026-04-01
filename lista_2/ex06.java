package lista_2;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        float preco = teclado.nextFloat();
        int quantidade = teclado.nextInt();

        if(quantidade<=10)
            System.out.printf("Nome:%s |Valor total:R$%.2f\n",nome,preco*quantidade);
        else if(quantidade<=20)
            System.out.printf("Nome:%s |Valor total:R$%.2f\n",nome,(preco*quantidade)*0.9);
        else if(quantidade<=50)
            System.out.printf("Nome:%s |Valor total:R$%.2f\n",nome,(preco*quantidade)*0.8);
        else
            System.out.printf("Nome:%s |Valor total:R$%.2f\n",nome,(preco*quantidade)*0.75);
        

        teclado.close();
    }
}
