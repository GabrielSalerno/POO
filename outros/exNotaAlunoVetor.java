package outros;

import java.util.Scanner;

public class exNotaAlunoVetor{
    public static void main(String[] args){
        int QNTD_DE_ALUNOS = 38;
        float media = 0f;
        Scanner teclado = new Scanner(System.in);

        String[] nomes;
        nomes = new String[QNTD_DE_ALUNOS];
        float[] notas;
        notas = new float[QNTD_DE_ALUNOS];

        for(int i=0;i<QNTD_DE_ALUNOS;i++){
            nomes[i] = teclado.nextLine();
        }
        for(int i=0;i<QNTD_DE_ALUNOS;i++){
            notas[i] = teclado.nextFloat();
            media += notas[i];
        }

        media /= QNTD_DE_ALUNOS;
        System.out.println("Média: "+media);

        for(int i=0;i<QNTD_DE_ALUNOS;i++){
            if(media<notas[i]){
                System.out.println("Parabéns, " + nomes[i] +"!");
            }
        }

        teclado.close();
    }
}