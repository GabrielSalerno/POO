package outros;

import java.util.Scanner;

public class jogoVelha {
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
        for(int c=0;c<N*2;c++){
            System.out.print("Jogador 1 escolha uma posição x: ");
            x = teclado.nextInt();
            System.out.print("Jogador 1 escolha uma posição y: ");
            y = teclado.nextInt();
            tabuleiro[x][y] = 'o';
            
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.printf("%c",tabuleiro[i][j]);
                }
                System.out.println();
            }

            System.out.print("Jogador 2 escolha uma posição x: ");
            x = teclado.nextInt();
            System.out.print("Jogador 2 escolha uma posição y: ");
            y = teclado.nextInt();
            tabuleiro[x][y] = 'x';
        
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.printf("%c",tabuleiro[i][j]);
                }
                System.out.println();
            }
        }
        
        teclado.close();
    }
}
