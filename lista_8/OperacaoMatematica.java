package lista_8;

import java.util.InputMismatchException;
import java.util.Scanner;

class OperacoesCalculadora{
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
        if (x == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        memoria /= x;
    }

    public void limparMemoria(){
        memoria = 0;
    }
}

public class OperacaoMatematica {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        OperacoesCalculadora calculadora1 = new OperacoesCalculadora();
        float x;

        int op = 0;

        while(op!=6){
            calculadora1.imprimir();
            try {
                op = teclado.nextInt();

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
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida.\n");
                
                teclado.nextLine(); 
            } catch (ArithmeticException e) {
                System.out.printf("Erro Matemático: %s\n", e.getMessage());
            }
        }

        teclado.close();
    }
}
