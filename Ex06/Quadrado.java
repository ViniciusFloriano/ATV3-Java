package Ex06;
public class Quadrado {

	private int lado = 0;
	
	public Quadrado(int lado) {
		setLado(lado);
	}
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int calcularArea() {
		return lado * lado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrado:\n");
		builder.append("lado = ");
		builder.append(lado);
		builder.append("\n");
		builder.append("Area = ");
		builder.append(calcularArea());	
		return builder.toString();
	}
	
	
}
