package lista_4;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o tamanho da lista: ");
        int n = teclado.nextInt();
        int[] v;
        v = new int[n];

        System.out.print("Insira os valores da lista: ");
        for(int i=0;i<n;i++){
            v[i] = teclado.nextInt();
        }

        System.out.print("Insira mais um valor na lista: ");
        int k = teclado.nextInt();
        System.out.print("Em qual posição deseja inserir: ");
        int p = teclado.nextInt();

        for(int i=0;i<n;i++){
            if(p>n){
                break;
            }else{
                if(p==i){
                    for(int j=n-1;j>i;j--){
                        v[j]=v[j-1];
                    }
                    v[i]=k;
                }
            }
        }

        if(p>n-1){
                System.out.println("Posição inválida.");
        } else{
            for(int i=0;i<n;i++){
                System.out.printf("%d ",v[i]);
            }
            System.out.printf("\n");
        }

        teclado.close();
    }
}
