package Ex04;
import java.util.Scanner;
public class SalarioMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe quanto você ganha pro hora: ");
		double ganhaHora = scan.nextDouble();
		System.out.print("Informe quantas horas você trabalha no mês: ");
		int horas = scan.nextInt();
		
		Salario salario = new Salario(ganhaHora * horas);
		
		System.out.println(salario.toString());
		
		scan.close();
	}
}
