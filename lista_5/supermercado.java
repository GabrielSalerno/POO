class Produto{
    String nome;
    float preco;
    int quantidadeEstoque;
}

class Item{
    Produto produto;
    int quantidadeItens;
    float calcularValor(){
        return produto.preco * quantidadeItens;
    }
}

class Pagamento {
    String tipo;
}

class Pedido{
    Item[] itens;
    float calcularValorTotal() {
        float soma = 0.0f;
        for(int i = 0; i < itens.length; i++)
            soma += itens[i].calcularValor(); 
        return soma;
    }
    Pagamento formaPagamento;
}

public class Supermercado{
    public static void main(String[] args){
        Produto arroz = new Produto();
        arroz.nome = "Arroz";
        arroz.preco = 10.00f;
        arroz.quantidadeEstoque = 100;
        
        Item item1 = new Item();
        item1.produto = arroz;
        item1.quantidadeItens = 3;

        Pedido pedido1 = new Pedido();
        pedido1.itens = new Item[1];
        pedido1.itens[0] = item1;
        Pagamento formaPag = new Pagamento();
        formaPag.tipo = "Cartão";
        pedido1.formaPagamento = formaPag;

        System.out.println("Resumo do pedido:");
        System.out.printf("Itens:\n%d - %s - R$%.2f\n", item1.quantidadeItens, item1.produto.nome, item1.calcularValor());
        System.out.printf("Valor total do pedido: %.2f\n",pedido1.calcularValorTotal());
        System.out.printf("Forma de pagamento selecionada: %s\n",pedido1.formaPagamento.tipo);
    }
}