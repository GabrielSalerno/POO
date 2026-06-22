package lista_7;

abstract class Funcionario1{
    protected String nome;
    protected float salarioBruto;

    protected Funcionario1(String nome, float salarioBruto){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public abstract float salarioLiquido();
}

class Vendedores extends Funcionario1{
    private float salarioLiquido;
    private float bonus;

    public Vendedores(String nome, float salarioBruto, float bonus){
        super(nome,salarioBruto);
        this.bonus = bonus;
    }

    public float salarioLiquido(){
        float salarioTotal = salarioBruto + bonus;
        if(salarioTotal<=900){
            salarioLiquido = salarioTotal;
        }else if(salarioTotal<=1500){
            salarioLiquido = salarioTotal - (salarioTotal*0.15f);
        }else{
            salarioLiquido = salarioTotal - (salarioTotal*0.2f);
        }

        return salarioLiquido;
    }
}

class Estagiarios extends Funcionario1{
    public Estagiarios(String nome, float salarioBruto){
        super(nome,salarioBruto);
    }

    public float salarioLiquido(){
        return salarioBruto;
    }
}

public class CalculadoraSalario{
    static public void main(String[] args){
        Vendedores f1 = new Vendedores("Claudio",890.27f,105.60f);
        Vendedores f2 = new Vendedores("Renan",750.79f,125.87f);
        Vendedores f3 = new Vendedores("Lucas",1800.99f,90.29f);

        Estagiarios e1 = new Estagiarios("Roberto",750.67f);
        Estagiarios e2 = new Estagiarios("Pedro",1000.98f);

        float salarioLiquido;

        salarioLiquido = f1.salarioLiquido();
        System.out.printf("%s tem salario liquido de %.2f\n",f1.nome,salarioLiquido);
        salarioLiquido = f2.salarioLiquido();
        System.out.printf("%s tem salario liquido de %.2f\n",f2.nome,salarioLiquido);
        salarioLiquido = f3.salarioLiquido();
        System.out.printf("%s tem salario liquido de %.2f\n",f3.nome,salarioLiquido);

        salarioLiquido = e1.salarioLiquido();
        System.out.printf("%s tem salario liquido de %.2f\n",e1.nome,salarioLiquido);
        salarioLiquido = e2.salarioLiquido();
        System.out.printf("%s tem salario liquido de %.2f\n",e2.nome,salarioLiquido);
    }
}