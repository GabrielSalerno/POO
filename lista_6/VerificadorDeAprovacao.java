package lista_6;

import java.util.Scanner;

class NotasAlunos{
    private float p1, p2, trab1, trab2, media;

    public NotasAlunos(float p1, float p2, float trab1, float trab2) {
        this.p1 = p1;
        this.p2 = p2;
        this.trab1 = trab1;
        this.trab2 = trab2;
    }

    public void calcularMedia(){
        media = (p1+p2+trab1+trab2)/3;
    }

    public void imprimirStatus(){
        if(media>=6){
            System.out.println("Aprovado");
        }else if(media>=4){
            System.out.println("Verificação suplementar");
        }else{
            System.out.println("Reprovado");
        }
    }
}

public class VerificadorDeAprovacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota P1: ");
        float p1 = teclado.nextFloat();
        System.out.print("Nota P2: ");
        float p2 = teclado.nextFloat();
        System.out.print("Nota trabalho 1: ");
        float trab1 = teclado.nextFloat();
        System.out.print("Nota trabalho 2: ");
        float trab2 = teclado.nextFloat();

        NotasAlunos aluno1 = new NotasAlunos(p1,p2,trab1,trab2);

        aluno1.calcularMedia();
        aluno1.imprimirStatus();

        teclado.close();
    }
}
