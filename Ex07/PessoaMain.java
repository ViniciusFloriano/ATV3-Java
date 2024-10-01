package Ex07;
public class PessoaMain {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Vinicius", 19, 50, 1.77);
		
		p1.envelhecer();
		p1.crescer();
		p1.emagrecer();
		
		System.out.println(p1);
	}
}
