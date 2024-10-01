package Ex05;
public class Menu {

	private int codigo = 0;
	private String descricao = "";
	private double preco = 0;
	
	public Menu(int codigo, String descricao, double preco) {
		setCodigo(codigo);
		setDescricao(descricao);
		setPreco(preco);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double calculaPreco(int quantidade) {
		return preco * quantidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(codigo);
		builder.append(" - ");
		builder.append(descricao);
		builder.append(": R$ ");
		builder.append(String.format("%.2f", preco));
		return builder.toString();
	}
	
	
	
}
