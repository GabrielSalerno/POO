package lista_6;

import java.util.Scanner;

class Calculadora{
    private float memoria = 0;

    public void imprimir(){
        System.out.printf("Estado da memória: %.2f\n", memoria);
        System.out.println("Opções: ");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Limpar memória");
        System.out.println("(6) Sair do programa");
        System.out.println("Qual opção você deseja?");
    }

    public void somar(float x){
        memoria += x;
    }

    public void subtrair(float x){
        memoria -= x;
    }

    public void multiplicar(float x){
        memoria *= x;
    }

    public void dividir(float x){
        memoria /= x;
    }

    public void limparMemoria(){
        memoria = 0;
    }
}

public class ex01{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora1 = new Calculadora();
        float x;

        calculadora1.imprimir();
        int op = teclado.nextInt();

        while(op!=6){
            switch (op) {
                case 1:
                    System.out.print("Qual valor deseja somar: ");
                    x = teclado.nextFloat();
                    calculadora1.somar(x);
                    break;
                case 2:
                    System.out.print("Qual valor deseja subtrair: ");
                    x = teclado.nextFloat();
                    calculadora1.subtrair(x);
                    break;
                case 3:
                    System.out.print("Qual valor deseja multiplicar: ");
                    x = teclado.nextFloat();
                    calculadora1.multiplicar(x);
                    break;
                case 4:
                    System.out.print("Qual valor deseja dividir: ");
                    x = teclado.nextFloat();
                    calculadora1.dividir(x);
                    break;
                case 5:
                    calculadora1.limparMemoria();
                    break;
                default:
                    break;
            }

            calculadora1.imprimir();
            op = teclado.nextInt();
        }

        teclado.close();
    }
}
