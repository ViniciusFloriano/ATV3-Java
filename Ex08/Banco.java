package Ex08;
public class Banco {

	private int numConta = 0;
	private String nome = "";
	private double saldo = 0;
	
	public Banco(int numConta, String nome, double saldo) {
		setNumConta(numConta);
		setNome(nome);
		setSaldo(saldo);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [numConta=");
		builder.append(numConta);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
