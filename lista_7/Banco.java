package lista_7;

abstract class ContasGenerico{
    private int numeroConta;
    protected float saldo;

    protected ContasGenerico(int numeroConta, float saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public abstract void sacar(float valorSacar);
    public abstract void depositar(float valorDepositar);
    
    public void verSaldo(){
        System.out.printf("Saldo: R$%.2f\n",saldo);
    }
}

class ContaComum extends ContasGenerico{
    public ContaComum(int numeroConta, float saldo){
        super(numeroConta, saldo);
    }

    public void sacar(float valorSacar){
        if(saldo-valorSacar<0){
            System.out.println("Erro: saldo indisponivel.");
        }else{
            saldo -= valorSacar;
            System.out.println("Valor sacado.");
        }
    }

    public void depositar(float valorDepositar){
        saldo += valorDepositar;
        System.out.println("Valor depositado.");
    }
}
class ContaPoupanca extends ContasGenerico{
    public ContaPoupanca(int numeroConta, float saldo){
        super(numeroConta, saldo);
    }

    public void sacar(float valorSacar){
        if(saldo-valorSacar<0){
            System.out.println("Erro: saldo indisponivel.");
        }else{
            saldo -= valorSacar;
            System.out.println("Valor sacado.");
        }
    }

    public void depositar(float valorDepositar){
        saldo += valorDepositar;
        System.out.println("Valor depositado.");
    }

    public void render(float taxaRendimento){
        saldo += saldo*(taxaRendimento/100f);
        System.out.printf("Valor rendendo a %.2f%%.\n",taxaRendimento);
    }
}
class ContaEspecial extends ContasGenerico{
    private float limiteConta;
    public ContaEspecial(int numeroConta, float saldo, float limiteConta){
        super(numeroConta, saldo);
        this.limiteConta = limiteConta;
    }

    public void sacar(float valorSacar){
        if(saldo-valorSacar< 0-limiteConta){
            System.out.println("Erro: saldo indisponivel.");
        }else{
            saldo -= valorSacar;
            System.out.println("Valor sacado.");
        }
    }

    public void depositar(float valorDepositar){
        saldo += valorDepositar;
        System.out.println("Valor depositado.");
    }
}

public class Banco {
    static public void main(String[] args){
        ContaComum cc = new ContaComum(1001, 500.70f);
        System.out.printf("Conta: %d\n",cc.getNumeroConta());
        cc.verSaldo();
        cc.depositar(200.10f);
        cc.verSaldo();
        cc.sacar(801.76f);
        cc.verSaldo();
        cc.sacar(150.50f);
        cc.verSaldo();
        System.out.println();

        ContaPoupanca cp = new ContaPoupanca(2002, 1020.65f);
        System.out.printf("Conta: %d\n",cp.getNumeroConta());
        cp.verSaldo();
        cp.render(10f);
        cp.verSaldo();
        cp.sacar(100f);
        cp.verSaldo();
        System.out.println();

        ContaEspecial ce = new ContaEspecial(3003, 302.99f, 500.90f);
        System.out.printf("Conta: %d\n",ce.getNumeroConta());
        ce.verSaldo();
        ce.sacar(606.43f);
        ce.verSaldo();
        ce.sacar(302.78f);
        ce.verSaldo();
        System.out.println();
    }
}
