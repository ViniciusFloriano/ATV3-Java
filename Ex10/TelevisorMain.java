package Ex10;
import java.util.Scanner;
public class TelevisorMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Televisor tv = new Televisor();

		int canal = 0;
		int volume = 0;
		char op1 = ' ';
		char op2 = ' ';
		char op3 = ' ';

		
		do {
			System.out.print("Você gostaria de escolher um canal? ");
			op1 = scan.nextLine().charAt(0);
			if (op1 != 's' && op1 != 'S' && op1 != 'n' && op1 != 'N') {
				System.out.println("Erro");
			}
		} while (op1 != 's' && op1 != 'S' && op1 != 'n' && op1 != 'N');

		if (op1 == 's' || op1 == 'S') {
			do {
				System.out.print("Qual canal você quer ver: ");
				canal = scan.nextInt();
				if (canal < 0) {
					System.out.println("Erro");
				}
			} while (canal < 0);
			tv.mudarCanal(canal);
		}

		scan.nextLine();

		do {
			System.out.print("Você quer mudar o volume? ");
			op2 = scan.nextLine().charAt(0);
			if (op2 != 's' && op2 != 'S' && op2 != 'n' && op2 != 'N') {
				System.out.println("Erro");
			}
		} while (op2 != 's' && op2 != 'S' && op2 != 'n' && op2 != 'N');
		if (op2 == 's' || op2 == 'S') {
			do {
				System.out.print("Quer almentar ou diminuir? (+ ou -): ");
				op3 = scan.nextLine().charAt(0);
				if (op3 != '+' && op3 != '-') {
					System.out.println("Erro");
				}
			} while (op3 != '+' && op3 != '-');
			if (op3 == '+') {
				do {
					System.out.print("Quanto quer aumentar? ");
					volume = scan.nextInt();
					if (volume < 0 || volume > 100) {
						System.out.println("Erro");
					}
				} while (volume < 0 || volume > 100);
				tv.aumentarVolume(volume);
			} else if (op3 == '-') {
				do {
					System.out.print("Quanto quer diminuir? ");
					volume = scan.nextInt();	
					if (volume < 0 || volume > 100) {
						System.out.println("Erro");
					}
				} while (volume < 0 || volume > 100);
				tv.diminuirVolume(volume);
			}
		}

		System.out.println(tv);

		scan.close();
	}
}
