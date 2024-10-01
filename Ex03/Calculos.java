package Ex03;
public class Calculos {

	private int n1 = 0;
	private int n2 = 0;
	private int soma = 0;
	private int sub = 0;
	private int multi = 0;
	private int div = 0;
	
	public Calculos(int n1, int n2) {
		setN1(n1);
		setN2(n2);
	}
	
	public int getN1() {
		return n1;
	}
	
	public void setN1(int n1) {
		this.n1 = n1;
	}
	
	public int getN2() {
		return n2;
	}
	
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public int getSoma() {
		return soma;
	}
	
	public void setSoma(int n1, int n2) {
		this.soma = n1 + n2;
	}
	
	public int getSub() {
		return sub;
	}
	
	public void setSub(int n1, int n2) {
		this.sub = n1 - n2;
	}
	
	public int getMulti() {
		return multi;
	}
	
	public void setMulti(int n1, int n2) {
		this.multi = n1 * n2;
	}
	
	public int getDiv() {
		return div;
	}
	
	public void setDiv(int n1, int n2) {
		this.div = n1 / n2;
	}
	
	public String operacoes() {
		setSoma(n1, n2);
		setSub(n1, n2);
		setMulti(n1, n2);
		setDiv(n1, n2);
		return toString();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("As operações basicas entre ");
		builder.append(n1);
		builder.append(" e ");
		builder.append(n2);
		builder.append(" é: \n");
		builder.append("Soma: ");
		builder.append(soma);
		builder.append("\nSubtração: ");
		builder.append(sub);
		builder.append("\nMultiplicação: ");
		builder.append(multi);
		builder.append("\nDivisão: ");
		builder.append(div);
		return builder.toString();
	}
	
	
	
}
