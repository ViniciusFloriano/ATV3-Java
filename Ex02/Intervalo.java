package Ex02;
public class Intervalo {

	private int a = 0;
	private int b = 0;
	
	public Intervalo(int a, int b) {
		setA(a);
		setB(b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("intervalo entre ");
		builder.append(a);
		builder.append(" até ");
		builder.append(b);
		builder.append("\n");
		for (int i = this.a; i <= this.b; i++) {
			if (i == this.b) {
				builder.append(i + "\n");				
			} else {
				builder.append(i + ", ");
			}
		}
		return builder.toString();
	}
	
}
