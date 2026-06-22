package lista_10;

import java.util.Scanner;
import java.lang.Thread;
import java.lang.Runnable;

class Primo implements Runnable{
    private static int totalPrimos = 0;

    private int inicio;
    private int fim;

    public Primo(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public static synchronized void adicionarPrimo() {
        totalPrimos++;
    }

    public static int getTotal() {
        return totalPrimos;
    }

    private boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        try {
            for (int i = inicio; i <= fim; i++) {
                if (ehPrimo(i)) {
                    adicionarPrimo();
                }
            }
        } catch (Exception e) {
            System.err.printf("Erro: %s\n", e.getMessage());
        }
    }
}

public class ConsultaPrimo {
    static public void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n = teclado.nextInt();

        int meio = n / 2;

        Primo primo1 = new Primo(0,meio);
        Primo primo2 = new Primo(meio+1,n);

        Thread t1 = new Thread(primo1);
        Thread t2 = new Thread(primo2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.err.printf("Erro: %s\n", e.getMessage());
        }
        System.out.printf("Total de números primos encontrados: %d\n", Primo.getTotal());

        teclado.close();
    }
}
