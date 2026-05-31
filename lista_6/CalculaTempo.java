package lista_6;

import java.util.Scanner;

class Conversao{
    private int seg, min, hora;

    public void lerSegundos(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Tempo em segundos: ");
        seg = teclado.nextInt();

        teclado.close();
    }

    private void converterSegundos(){
        hora = seg / 3600;
        int resto = seg % 3600;

        min = resto / 60;
        seg = resto % 60;
    }

    public void imprimir(){
        converterSegundos();
        System.out.printf("Horas: %d | Minutos:%d | Segundos:%d\n",hora,min,seg);
    }
}

public class CalculaTempo {
    public static void main(String[] args){
        Conversao conversor1 = new Conversao();
        conversor1.lerSegundos();
        conversor1.imprimir();
    }
}
