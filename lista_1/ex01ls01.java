import java.util.Scanner;

public class ex01ls01 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		System.out.print("Olá, "+nome+"! Bem-vindo ao Java!\n");

		teclado.close();
	}
}

