package lista_3;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int contadorDeA = 0;
        int tamanhoFrase;

        System.out.printf("Digite uma palavra ou frase: ");
        String frase = teclado.nextLine();
        tamanhoFrase = frase.length();

        for(int i=0;i<tamanhoFrase;i++){
            if(frase.charAt(i)=='a'||frase.charAt(i)=='A')
                contadorDeA++;
        }

        System.out.printf("Número total de caracteres: %d\n",tamanhoFrase);
        System.out.printf("Maiúsculo: %s\n",frase.toUpperCase());
        System.out.printf("Minúscula: %s\n",frase.toLowerCase());
        System.out.printf("Quantos A's tem: %d\n",contadorDeA);

        teclado.close();
    }
}
