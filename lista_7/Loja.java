/*
Todos são usuários logo funcionario, gerente e cliente herdam de usuários. Um gerente é também um funcionário, logo a classe gerente herda da classe funcionário.
*/

package lista_7;

class Usuario{
    protected String nome;
    protected String senha;

    protected Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
}

class Cliente extends Usuario{
    private String endereco;
    private long cpf;
    private long telefone;

    public Cliente(String nome, String senha, String endereco, long cpf, long telefone){
        super(nome, senha);
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void imprimirDadosCliente(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Senha: %s\n", senha);
        System.out.printf("Endereço: %s\n", endereco);
        System.out.printf("CPF: %d\n", cpf);
        System.out.printf("Telefone: %d\n", telefone);
        System.out.println();
    }
}

class Funcionario extends Usuario{
    public Funcionario(String nome, String senha){
        super(nome, senha);
    }

    public void imprimirDadosFuncionario(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Senha: %s\n", senha);
        System.out.println();
    }

    public float realizarVenda(int qntdProdutos, float valorProdutos){
        return  qntdProdutos * valorProdutos;
    }
}

class Gerente extends Funcionario{
    private int qntdFuncionarios;
    private float soma = 0;

    public Gerente(String nome, String senha, int qntdFuncionarios){
        super(nome, senha);
        this.qntdFuncionarios = qntdFuncionarios;
    }

    public float fecharCaixa(float valorTotalFunc[]){
        for(int i=0;i<qntdFuncionarios;i++){
            soma += valorTotalFunc[i];
        }
        return soma;
    }
}

public class Loja {
    static public void main(String[] args){
            Cliente c = new Cliente("Pedro Pascal", "12342", "Rua Samuel Rosa, 223", 95476547378l, 21993246785l);
            c.imprimirDadosCliente();

            Funcionario f1 = new Funcionario("Julia", "21431");
            f1.imprimirDadosFuncionario();
            Funcionario f2 = new Funcionario("Lucas", "65238");
            f2.imprimirDadosFuncionario();

            float valor;
            float valorTotal[] = new float[3];

            valor = f1.realizarVenda(2, 10);
            valorTotal[0] = valor;
            System.out.printf("Funcionário %s vendeu 2 guarda chuvas por R$%.2f reais.\n",f1.nome,valor);
            System.out.println();

            valor = f2.realizarVenda(1, 34.90f);
            valorTotal[1] = valor;
            System.out.printf("Funcionário %s vendeu 2 guarda chuvas por R$%.2f reais.\n",f2.nome, valor);
            System.out.println();

            Gerente g = new Gerente("Cleiton", "909", 3);
            g.imprimirDadosFuncionario();

            valor = g.realizarVenda(4, 11.50f);
            valorTotal[2] = valor;
            System.out.printf("Funcionário %s vendeu 2 guarda chuvas por R$%.2f reais.\n",g.nome,valor);
            System.out.println();

            float valorFechamento = g.fecharCaixa(valorTotal);
            System.out.printf("Valor de fechamento da loja foi de R$%.2f.\n",valorFechamento);
        }
}
   