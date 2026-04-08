package lista_4;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int n = teclado.nextInt();

        int[] v;
        v = new int[n];

        System.out.print("Insira os valores no vetor: ");
        for(int i=0;i<n;i++){
            v[i] = teclado.nextInt();
        }

        System.out.print("Posição que deseja ver: ");
        int k = teclado.nextInt();

        if(k<n){
            System.out.printf("O número que está na porsição %d é %d.\n",k,v[k]);
        } else{
            System.out.println("Número não encontrado.");
        }
        teclado.close();
    }
}
