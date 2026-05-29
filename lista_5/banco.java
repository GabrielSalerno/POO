import java.util.Scanner;

class ContaCorrente{
    float saldo;
    public void depositar(float valorDepositado){
        System.out.println("Deposito realizado com sucesso!");
        saldo += valorDepositado;
    }
    public void sacar(float valorSacado){
        if(valorSacado+1.5f <= saldo){
            System.out.println("Saque realizado com sucesso!");
            saldo -= (valorSacado+1.5f);
        }else{
            System.out.println("Valor de saque indisponível.");
        }
    }
    public void mostrarSaldo(){
        System.out.printf("Saldo: R$%.2f\n",saldo);
    }
}

public class banco{
    static public void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente();

        conta1.saldo = 0.0f;

        System.out.print("Deseja ver seu saldo(v), sacar(s), depositar(d) ou sair do banco(t): ");
        char opcao = teclado.next().charAt(0);

        while(opcao!='t'){
            if(opcao=='v')
                conta1.mostrarSaldo();

            if(opcao=='s'){
                System.out.print("Quanto deseja sacar: ");
                float valorSacado = teclado.nextFloat();
                conta1.sacar(valorSacado);
            }

            if(opcao=='d'){
                System.out.print("Quanto deseja depositar: ");
                float valorDepositado = teclado.nextFloat();
                conta1.depositar(valorDepositado);
            }

            teclado.nextLine();

            System.out.print("Deseja ver seu saldo(v), sacar(s), depositar(d) ou sair do banco(t): ");
            opcao = teclado.next().charAt(0);
        }

        teclado.close();
    }
}