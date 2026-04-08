package lista_4;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int QNTD_PESSOAS = 5;

        String[] nomes;
        nomes = new String[QNTD_PESSOAS];
        int[] idades;
        idades = new int[QNTD_PESSOAS];
        
        System.out.print("Insira os nomes: ");
        for(int i=0;i<QNTD_PESSOAS;i++){
            nomes[i] = teclado.nextLine();
        }

        System.out.print("Insira as idades: ");
        for(int i=0;i<QNTD_PESSOAS;i++){
            idades[i] = teclado.nextInt();
        }

        for(int i=0;i<QNTD_PESSOAS;i++){
            System.out.printf("Nome: %s | Idade: %d\n",nomes[i],idades[i]);
        }

        for (int i = 0; i < QNTD_PESSOAS - 1; i++) {
            for (int j = 0; j < QNTD_PESSOAS - 1 - i; j++) {
                if (nomes[j].compareTo(nomes[j+1]) > 0) {
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j+1];
                    nomes[j+1] = tempNome;

                    int tempIdade = idades[j];
                    idades[j] = idades[j+1];
                    idades[j+1] = tempIdade;
                }
            }
        }

        System.out.println("============");
         for(int i=0;i<QNTD_PESSOAS;i++){
            System.out.printf("Nome: %s | Idade: %d\n",nomes[i],idades[i]);
        }
            
        for (int i = 0; i < QNTD_PESSOAS - 1; i++) {
            for (int j = 0; j < QNTD_PESSOAS - 1 - i; j++) {
                if (idades[j] > idades[j + 1]) {
                    int tempIdade = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempIdade;

                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }

        System.out.println("============");
         for(int i=0;i<QNTD_PESSOAS;i++){
            System.out.printf("Nome: %s | Idade: %d\n",nomes[i],idades[i]);
        }

        teclado.close();
    }
}
