import java.util.Scanner;

public class ex02 {
        public static void main(String[] args){
                Scanner teclado = new Scanner(System.in);
                int c = teclado.nextInt();
                float f = (c*1.8f)+32;
		System.out.println(f);

                teclado.close();
        }

}
