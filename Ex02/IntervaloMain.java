package Ex02;
import java.util.Scanner;
public class IntervaloMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o começo do intervalo: ");
		int a = scan.nextInt();
		System.out.print("Informe o final do intervalo: ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("Fazendo a inversão");
			Intervalo intervalo = new Intervalo(b, a);
			System.out.println(intervalo.toString());
		} else {
			Intervalo intervalo = new Intervalo(a, b);
			System.out.println(intervalo.toString());
		}
		
		
		scan.close();
	}
}
