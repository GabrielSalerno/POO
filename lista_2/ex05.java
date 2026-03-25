package lista_2;

import java.util.Scanner;
import java.lang.Math;

public class ex05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int xa = teclado.nextInt();
        int ya = teclado.nextInt();
        int xb = teclado.nextInt();
        int yb = teclado.nextInt();
        int xc = teclado.nextInt();
        int yc = teclado.nextInt();

        double principal = (xa * yb) + (xb * yc) + (xc * ya);
        double secundaria = (ya * xb) + (yb * xc) + (yc * xa);
        double det = principal - secundaria;
        if(det==0){
            System.out.println("Não é um triangulo.\n");
        }else{
            //verificar tipo
            double ab = Math.pow(xa-xb,2)+Math.pow(ya-yb,2);
            double ac = Math.pow(xa-xc,2)+Math.pow(ya-yc,2);
            double bc = Math.pow(xb-xc,2)+Math.pow(yb-yc,2);
            if(ab==ac&&ac==bc)
                System.out.println("É um triangulo equilatero.\n");
            else if(ab!=ac&&ab!=bc&&ac!=bc)
                System.out.println("É um triangulo escaleno.\n");
            else
                System.out.println("É um triangulo isoceles.\n");
        }

        teclado.close();
    }
}
