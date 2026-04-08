package lista_4;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numAlunos = teclado.nextInt();
        float[] notas;
        notas = new float[numAlunos];

        float somaMedia = 0;
        for(int i=0;i<numAlunos;i++){
            notas[i] = teclado.nextFloat();
            somaMedia += notas[i];
        }

        float media = somaMedia/numAlunos;

        System.out.printf("Média: %.2f\n",media);

        System.out.print("Notas acima da média: ");
        for(int i=0;i<numAlunos;i++){
            if(notas[i]>media){
                System.out.printf("%.2f ",notas[i]);
            }
        }
        System.out.printf("\n");

        teclado.close();
    }
}
