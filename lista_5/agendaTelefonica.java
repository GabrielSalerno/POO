import java.util.Scanner;

class Contato{
    String nome;
    long numero;
}

class Agenda{
    Contato[] listaContatos;
}

public class agendaTelefonica {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Contato contato1 = new Contato();
        contato1.nome = "Sonia";
        contato1.numero = 21999721314L;

        Contato contato2 = new Contato();
        contato2.nome = "Carla";
        contato2.numero = 21999721011L;


        Agenda agen = new Agenda();
        agen.listaContatos = new Contato[2];
        agen.listaContatos[0] = contato1;
        agen.listaContatos[1] = contato2;

        System.out.println("Agenda Telefónica:");
        for(int i=0;i<2;i++)
            System.out.println(agen.listaContatos[i].nome);
        
        System.out.print("Digite o nome do contato que deseja ver: ");
        String n = teclado.nextLine();
        boolean encontrou = false;

        for(int i=0;i<agen.listaContatos.length;i++){
            if(n.equals(agen.listaContatos[i].nome)){
                System.out.println(agen.listaContatos[i].nome);
                System.out.println(agen.listaContatos[i].numero);
                encontrou = true;
                break;
            }
        }
        if(!encontrou)
            System.out.println("Contato inexistente.");

        teclado.close();
    }
}
