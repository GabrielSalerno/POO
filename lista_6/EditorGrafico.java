package lista_6;

import java.util.Scanner;

class Retangulo {
    private int x;
    private int y;
    private int largura;
    private int altura;

    public Retangulo(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public void mover(int novoX, int novoY) {
        x = novoX;
        y = novoY;
    }

    public void desenhar() {
        System.out.printf("Retangulo(%d, %d, %d, %d)\n",x, y, largura, altura);
    }

    public void redimensionar(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (sx / 100 * largura);
            altura = (int) (sy / 100 * altura);
        }
    }
}

class Circulo{

}

public class EditorGrafico {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Retangulo r1, r2;
        r1 = new Retangulo(10,20,100,200);
        r2 = r1;

        teclado.close();
    }
}
