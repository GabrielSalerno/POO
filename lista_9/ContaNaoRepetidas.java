package lista_9;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class ContaNaoRepetidas {
    static public void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine().toLowerCase();
        String[] palavras = frase.split(" ");

        Set<String> conjuntoPalavras = new HashSet<>();
        for (int i = 0; i < palavras.length; i++) {
            conjuntoPalavras.add(palavras[i]);
        }
        System.out.printf("Quantidade de palavras não repetidas: %d", conjuntoPalavras.size());

        teclado.close();
    }
}
