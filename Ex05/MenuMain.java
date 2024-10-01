package Ex05;
import java.util.Scanner;
public class MenuMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int MAX = 6;
		Menu itens[] = new Menu[MAX];
		int codigo = 0;
		int quantidade = 0;
		int index = 0;
		double totalItem = 0;
		double totalGeral = 0;

		itens[0] = new Menu(100, "Cachorro Quente", 1.20);
		itens[1] = new Menu(101, "Bauru Simples", 1.30);
		itens[2] = new Menu(102, "Bauru com Ovo", 1.50);
		itens[3] = new Menu(103, "Hambúrguer", 1.20);
		itens[4] = new Menu(104, "Cheeseburguer", 1.30);
		itens[5] = new Menu(105, "Refrigerante", 1.00);


		System.out.println("Bem-vindo à lanchonete!");
		System.out.println("Menu:");
		for (Menu item : itens) {
			System.out.println(item);
		}

		do {
			System.out.print("Digite o código do item (ou 0 para encerrar o pedido): ");
			codigo = scan.nextInt();
			if (codigo == 0) {

			} else if (codigo < 100 || codigo > 105) {
				System.out.println("Código inválido");
			} else {
				System.out.print("Digite a quantidade desejada: ");
				quantidade = scan.nextInt();
				if (codigo == 100) {
					index = 0;
					totalItem = itens[index].calculaPreco(quantidade);
					totalGeral += totalItem;
				} else if (codigo == 101) {
					index = 1;
					totalItem = itens[index].calculaPreco(quantidade);
					totalGeral += totalItem;
				} else if (codigo == 102) {
					index = 2;
					totalItem = itens[index].calculaPreco(quantidade);
					totalGeral += totalItem;
				} else if (codigo == 103) {
					index = 3;
					totalItem = itens[index].calculaPreco(quantidade);
					totalGeral += totalItem;
				} else if (codigo == 104) {
					index = 4;
					totalItem = itens[index].calculaPreco(quantidade);
					totalGeral += totalItem;
				} else if (codigo == 105) {
					index = 5;
					totalItem = itens[index].calculaPreco(quantidade);
					totalGeral += totalItem;
				}
				System.out.println("Item: " + itens[index].getDescricao() + " | Quantidade: " + quantidade + "| Total: R$ " + String.format("%.2f", totalItem));
			}
		} while (codigo != 0);

		System.out.println("Total geral do pedido: R$ " + String.format("%.2f", totalGeral));

		scan.close();
	}
}
