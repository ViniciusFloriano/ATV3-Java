package Ex01;
public class Usuario {

	private String nome = "";
	private String sobreNome = "";
	
	public Usuario(String nome, String sobreNome) {
		setNome(nome);
		setSobreNome(sobreNome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Seu nome completo é: ");
		builder.append(nome);
		builder.append(" ");
		builder.append(sobreNome);
		return builder.toString();
	}
	
	
}
