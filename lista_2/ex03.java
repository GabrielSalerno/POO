package lista_2;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int segundos = teclado.nextInt();
        int hora = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        System.out.printf("%d:%d:%d\n",hora,minutos,segundos);
    }
}
