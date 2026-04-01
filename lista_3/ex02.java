/*
a) O programa A está certo, pois no programa B se -1 for o primeiro valor digitado 
pelo usuário o -1 vai ser printado, enquanto no programa A não.
*/

/*
b)Para corrigir o programa B em vez de fazer "do{}while();" teria que fazer igual 
o programa A um "while();" normal e um scanf antes do while ou usar um if dentro 
do "do" em volta do print para verificar se foi digitado -1, se sim dar um "break;".
*/
package lista_3;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int codigo;

        do{
            System.out.print("Informe o código: ");
            codigo = teclado.nextInt();
            if(codigo==-1){
                break;
            }
            System.out.println("Código: " + codigo);
        } while(codigo != -1);

        teclado.close();
    }
    
}