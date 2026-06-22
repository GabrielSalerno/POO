package lista_6;

import java.util.Scanner;

class Retangulo {
    private int x;
    private int y;
    private int largura;
    private int altura;

    public int getLargura() { return largura; }

    public int getAltura() { return altura; }

    public int getX() { return x; }

    public int getY() { return y; }

    public void setLargura(int larg) { if (larg > 0) largura = larg; }

    public void setAltura(int alt) { if (alt > 0) altura = alt; }

    public void setX(int x) { this.x = x; }

    public void setY(int y) { this.y = y; }

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
    private int x;
    private int y;
    private int raio;

    public int getRaio() { return raio; }

    public int getX() { return x; }

    public int getY() { return y; }

    public void setRaio(int r) { if (r > 0) raio = r; }

    public void setX(int x) { this.x = x; }

    public void setY(int y) { this.y = y; }

    public void mover(int novoX, int novoY) {
        x = novoX;
        y = novoY;
    }

    public void desenhar() {
        System.out.printf("Circulo(%d, %d, %d)\n",x, y, raio);
    }

    public void redimensionar(float sx) {
        if (sx > 0) {
            raio = (int) (sx / 100 * raio);
        }
    }
}

public class EditorGrafico {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Retangulo r1, r2;

        r1 = new Retangulo();
        r1.setX(10);
        r1.setY(20);
        r1.setAltura(100);
        r1.setLargura(200);

        r2 = new Retangulo();
        r2.setX(5);
        r2.setY(15);
        r2.setAltura(50);
        r2.setLargura(150);
        
        System.out.println("Retangulos originais:");
        System.out.println("Retangulo 1:");
        r1.desenhar();
        System.out.println("Retangulo 2:");
        r2.desenhar();
        System.out.println();

        r1.redimensionar(20, 75);
        r2.redimensionar(15, 25);

        System.out.println("Retangulos redimensionados:");
        System.out.println("Retangulo 1:");
        r1.desenhar();
        System.out.println("Retangulo 2:");
        r2.desenhar();
        System.out.println();

        r1.mover(100, 200);
        r2.mover(50, 110);
        
        System.out.println("Retangulos movidos:");
        System.out.println("Retangulo 1:");
        r1.desenhar();
        System.out.println("Retangulo 2:");
        r2.desenhar();
        System.out.println();

        Circulo c1 = new Circulo();
        
        System.out.print("Digite o valor de x do circulo: ");
        int x = teclado.nextInt();
        c1.setX(x);
        System.out.print("Digite o valor de y do circulo: ");
        int y = teclado.nextInt();
        c1.setY(y);
        System.out.print("Digite o valor do raio do circulo: ");
        int raio = teclado.nextInt();
        c1.setRaio(raio);

        System.out.println("Ciruclo original:");
        c1.desenhar();
        System.out.println();

        c1.redimensionar(10);

        System.out.println("Circulo redimensionado:");
        c1.desenhar();
        System.out.println();

        c1.mover(75, 130);

        System.out.println("Circulo movido:");
        c1.desenhar();

        teclado.close();
    }
}
