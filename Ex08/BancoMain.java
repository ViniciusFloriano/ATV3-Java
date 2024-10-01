package Ex08;
public class BancoMain {
	public static void main(String[] args) {

		Banco b1 = new Banco(1, "vini", 1000);

		b1.deposito(100);
		b1.saque(200);
		
		System.out.println(b1);
	}
}
