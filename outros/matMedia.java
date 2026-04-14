package outros;

import java.util.Scanner;

public class matMedia {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos alunos: ");
        int numAlunos = teclado.nextInt();
        teclado.nextLine();

        float[] media = new float[numAlunos];
        for(int i=0;i<numAlunos;i++){
            media[i]=0;
        }

        String[] nomes = new String[numAlunos];
        for(int i =0;i<numAlunos;i++){
            System.out.printf("Nome do aluno %d: ",i+1);
            nomes[i] = teclado.nextLine();
        }

        System.out.print("Quantas provas: ");
        int numProvas = teclado.nextInt();

        float[][] mat = new float[numAlunos][numProvas];
        for(int i=0;i<numAlunos;i++){
            for(int j=0;j<numProvas;j++){
                System.out.printf("Insira a nota da prova %d do aluno %s: ",j+1,nomes[i]);
                mat[i][j] = teclado.nextFloat();
                media[i] += mat[i][j];
            }
            media[i] /= numProvas;
        }

        for(int i=0;i<numAlunos;i++){
            System.out.printf("Aluno %s: ",nomes[i]);
            for(int j=0;j<numProvas;j++){
                System.out.printf("%.2f ",mat[i][j]);
            }
            System.out.printf("| Média %s: %.2f\n",nomes[i],media[i]);
        }

        teclado.close();
    }
}
