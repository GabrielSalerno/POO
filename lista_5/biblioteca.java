import java.util.Scanner;

class Livro{
    String titulo;
    String autor;
}

class Emprestimo{
    Livro livroEmprestado;
    int tempo;
}

class Pessoa{
    String nome;
    Emprestimo[] emprestimos;
}

public class biblioteca {
    static public void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Livro[] livrosDisponiveis = new Livro[3];

        Pessoa p = new Pessoa();
        System.out.print("Qual seu nome: ");
        p.nome = teclado.nextLine();
        p.emprestimos = new Emprestimo[3];

        Livro livro1 = new Livro();
        livro1.titulo = "Percy Jackson e o Ladrão de Raios";
        livro1.autor = "Rick Riordan";
        livrosDisponiveis[0] = livro1;

        Livro livro2 = new Livro();
        livro2.titulo = "Harry Potter e a Pedra Filosofal";
        livro2.autor = "J.K. Rowling";
        livrosDisponiveis[1] = livro2;

        Livro livro3 = new Livro();
        livro3.titulo = "Jogos Vorazes";
        livro3.autor = "Suzanne Collins";
        livrosDisponiveis[2] = livro3;

        String parar = "S";
        int j=0;

        while(parar.equals("S")){
            Emprestimo livroE = new Emprestimo();

            System.out.println("Livros disponíveis: Percy Jackson e o Ladrão de Raios | Harry Potter e a Pedra Filosofal | Jogos Vorazes");
            
            System.out.print("Qual livro deseja pegar emprestado: ");
            String l = teclado.nextLine();

            boolean encontrou = false;
            for(int i=0;i<livrosDisponiveis.length;i++){
                if(l.equals(livrosDisponiveis[i].titulo)){
                    livroE.livroEmprestado = livrosDisponiveis[i];
                    encontrou = true;
                    break;
                }
            }

            if(!encontrou)
                System.out.println("Livro não encontrado.");
            else{
                System.out.print("Por quantos dias quer emprestado: ");
                livroE.tempo = teclado.nextInt();
                p.emprestimos[j] = livroE;
                teclado.nextLine();
                j++;
            }

            System.out.print("Quer alugar mais algum livro(S/N): ");
            parar = teclado.nextLine();
        }

        if(p.emprestimos.length>0){
            System.out.println("==================================================");
            System.out.printf("Resumo do empréstimo de %s:\n",p.nome);
            System.out.println("==================================================");
            for(int i=0;i<j;i++){
                System.out.printf("Título: %s\n",p.emprestimos[i].livroEmprestado.titulo);
                System.out.printf("Autor: %s\n",p.emprestimos[i].livroEmprestado.autor);
                System.out.printf("Tempo de empréstimo: %d\n",p.emprestimos[i].tempo);
                System.out.println("==================================================");
            }
        }else
            System.out.println("Nenhum livro emprestado.");

        teclado.close();
    }
}
