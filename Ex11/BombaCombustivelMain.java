package Ex11;
import java.util.Scanner;
public class BombaCombustivelMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.59, 1000);

		int opcao = 0;

		bomba.statusBomba();

		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Abastecer por valor");
			System.out.println("2 - Abastecer por litro");
			System.out.println("3 - Alterar valor do litro");
			System.out.println("4 - Alterar tipo de combustível");
			System.out.println("5 - Alterar quantidade de combustível");
			System.out.println("6 - Mostrar status da bomba");
			System.out.println("0 - Sair");
			opcao = scan.nextInt();
			if (opcao == 0) {
				System.out.println("Encerrando o programa...");
			}
			switch (opcao) {
				case 1:
					System.out.println("Informe o valor para abastecer:");
					double valor = scan.nextDouble();
					bomba.abastecerPorValor(valor);
					break;
	
				case 2:
					System.out.println("Informe a quantidade de litros a abastecer:");
					double litros = scan.nextDouble();
					bomba.abastecerPorLitro(litros);
					break;
	
				case 3:
					System.out.println("Informe o novo valor do litro:");
					double novoValor = scan.nextDouble();
					bomba.alterarValor(novoValor);
					break;
	
				case 4:
					System.out.println("Informe o novo tipo de combustível:");
					scan.nextLine();
					String novoTipo = scan.nextLine();
					bomba.alterarCombustivel(novoTipo);
					break;
	
				case 5:
					System.out.println("Informe a nova quantidade de combustível:");
					double novaQuantidade = scan.nextDouble();
					bomba.alterarQuantidadeCombustivel(novaQuantidade);
					break;
	
				case 6:
					bomba.statusBomba();
					break;
	
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		} while(opcao != 0);

		scan.close();
	}
}
