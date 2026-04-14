package outros;

import java.util.Scanner;

public class jogoVelha {
    public static boolean ganhou(char[][] tab, char j, int N) {
    for (int i = 0; i < N; i++) {
        if ((tab[i][0] == j && tab[i][1] == j && tab[i][2] == j) || 
            (tab[0][i] == j && tab[1][i] == j && tab[2][i] == j)) return true;
    }

    if ((tab[0][0] == j && tab[1][1] == j && tab[2][2] == j) || 
        (tab[0][2] == j && tab[1][1] == j && tab[2][0] == j)) return true;
    
    return false;
}
    public static void main(String[] args) {
        final int N = 3;
        int x,y;
        char[][] tabuleiro = new char[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                tabuleiro[i][j] = '-';
            }
        }

        Scanner teclado = new Scanner(System.in);

        for(int c = 0; c < 5; c++) {
            while (true) {
                System.out.print("Jogador 1 escolha uma posição x: ");
                x = teclado.nextInt();
                System.out.print("Jogador 1 escolha uma posição y: ");
                y = teclado.nextInt();

                if (x >= 0 && x < N && y >= 0 && y < N && tabuleiro[x][y] == '-') {
                    tabuleiro[x][y] = 'o';
                    break;
                } else {
                    System.out.println("ERRO: Posição inválida ou já ocupada! Tente outra.");
                }
            }
            tabuleiro[x][y] = 'o';
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++)
                    System.out.printf("%c",tabuleiro[i][j]);
                System.out.println();
            }

            if (ganhou(tabuleiro, 'o', N)) {
                System.out.println("Jogador 1 VENCEU!");
                break;
            }
            
            if (c == 4) { 
                System.out.println("EMPATE!");
                break;
            }

            while (true) {
                System.out.print("Jogador 2 escolha uma posição x: ");
                x = teclado.nextInt();
                System.out.print("Jogador 2 escolha uma posição y: ");
                y = teclado.nextInt();

                // Verifica se a posição está dentro do tabuleiro e se está vazia
                if (x >= 0 && x < N && y >= 0 && y < N && tabuleiro[x][y] == '-') {
                    tabuleiro[x][y] = 'o';
                    break; // Sai do while interno e segue para imprimir o tabuleiro
                } else {
                    System.out.println("ERRO: Posição inválida ou já ocupada! Tente outra.");
                }
            }
            tabuleiro[x][y] = 'x';
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++)
                    System.out.printf("%c",tabuleiro[i][j]);
                System.out.println();
            }

            if (ganhou(tabuleiro, 'x', N)) {
                System.out.println("Jogador 2 VENCEU!");
                break;
            }
        }
        
        teclado.close();
    }
}
