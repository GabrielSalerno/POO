import java.util.Scanner;

class Data{
    int dia,mes, ano;
    String separador = "/";

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private boolean dataValida(){
        if (dia<1 || dia>31){
            return false;
        }
        if (mes<1|| mes>12){
            return false;
        }
        if (ano<0 || ano>2026){
            return false;
        }

        return true;
    }
    public boolean anoBissexto(){
        if (dataValida()){
            if(ano%100==0){
                if(ano%400==0){
                    return true;
                }
            }else{
                if(ano%4==0){
                    return true;
                }
            }
        }
        return false;
    }
    public void imprime(){
        if(!dataValida()){
            System.out.println("INVÁLIDA");
        }else{
            System.out.printf("%d%s%d%s%d\n", dia, separador, mes, separador, ano);
            if(anoBissexto())
                System.out.println("Ano é bissexto.");
            else
                System.out.println("Ano não é bissexto.");

        }
    }
}

public class VerificadorDeData {
    static public void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dia: ");
        int d = teclado.nextInt();

        System.out.print("Mês: ");
        int m = teclado.nextInt();

        System.out.print("Ano: ");
        int a = teclado.nextInt();

        Data data1 = new Data(d, m, a);

        System.out.print("Quer separador customizado (S/N): ");
        char resposta = teclado.next().charAt(0);

        if(resposta == 'S'){
            System.out.print("Digite um separador customizado: ");
            data1.separador = teclado.next();
        }

        data1.imprime();

        teclado.close();
    }
}
