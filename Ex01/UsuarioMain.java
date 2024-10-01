package Ex01;
import java.util.Scanner;
public class UsuarioMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Informe seu sobrenome: ");
		String sobreNome = scan.nextLine();
		
		Usuario usu = new Usuario(nome, sobreNome);
		
		System.out.println(usu);
		
		scan.close();
	}
}
