package lista_9;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContaOcorrencia {
    static public void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine().toLowerCase();
        String[] palavras = frase.split(" ");

        Map<String,Integer> ocorrencias = new HashMap<>();

        for (int i = 0; i < palavras.length; i++){   
            if(ocorrencias.containsKey(palavras[i])){
                ocorrencias.put(palavras[i],ocorrencias.get(palavras[i])+1);
            }else{
                ocorrencias.put(palavras[i],1);
            }  
        }

        for(String palavra : ocorrencias.keySet()){
            System.out.printf("Palavra:%s  : Ocorrencia:%d\n",palavra,ocorrencias.get(palavra));
        }

        teclado.close();
    }
}
