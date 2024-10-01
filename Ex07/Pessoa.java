package Ex07;
public class Pessoa {

	private String nome = "";
	private int idade = 0;
	private double peso = 0;
	private double altura = 0;

	public Pessoa(String nome, int idade, double peso, double altura) {
		setNome(nome);
		setIdade(idade);
		setPeso(peso);
		setAltura(altura);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void envelhecer() {
		this.idade += 1;
		if (idade < 21) {
			this.altura += 0.005;
		}
	}

	public void engordar() {
		this.peso += 1;
	}

	public void emagrecer() {
		this.peso -= 1;
	}

	public void crescer() {
		this.altura += 0.2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
	
}
