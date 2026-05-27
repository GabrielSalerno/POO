class Produto{
    String nome;
    int preco;
    int quantidadeEstoque;
}

class Item{
    Produto produto;
    int quantidadeItens;
}

class Pedido{
    Item[] itens;
}

class Pagamento{
    public static void credito(){}
    public static void cheque(){}
    public static void dinheiro(){}
}

public class supermercado{
    public static void main(String[] args){
        
    }
}