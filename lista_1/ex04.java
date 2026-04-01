import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int moeda = teclado.nextInt();
        int umReal=0,cin=0,vint=0,dez=0,cinco=0,um=0;
        while(moeda!=0){
            umReal = moeda/100;
            moeda %=100;

            cin = moeda/50;
            moeda%=50;

            vint = moeda/25;
            moeda%=25;

            dez=moeda/10;
            moeda%=10;

            cinco=moeda/5;
            moeda%=5;

            um=moeda/1;
            moeda%=1;
           
        }

        System.out.println("1: "+umReal+"| .50: " + cin +"| .25: "+vint+"| .10:"+dez+"| .5:"+cinco+"| .1:"+um);

        teclado.close();
    }
}
