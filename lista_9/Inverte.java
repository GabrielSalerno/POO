package lista_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inverte {
    static public void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma frase para ser invertida: ");
        String frase = teclado.nextLine();

        List<String> fraseLista = new ArrayList<>(Arrays.asList(frase.split(" ")));

        for(int i=fraseLista.size()-1;i>=0;i--){
            System.out.print(fraseLista.get(i) + ' ');
        }

        teclado.close();
    }
}
