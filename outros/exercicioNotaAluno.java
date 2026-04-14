package outros;

import java.util.Scanner;

public class exercicioNotaAluno {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int nota, notaDecimal;

        System.out.print("Digite a nota do aluno: ");
        nota = teclado.nextInt();

        /*
        if(nota<=100 && nota>=90){
            System.out.println("A");
        } else if(nota>=80){
            System.out.println("B");
        } else if(nota>=70){
            System.out.println("C");
        } else if(nota>= 60){
            System.out.println("D");
        } else if (nota <=60 && nota>=0){
            System.out.println("F");
        } else{
            System.out.println("Nota inválida");
        }
        */

        notaDecimal = nota/10;

        switch (notaDecimal) {
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }



        teclado.close();
    }
}
