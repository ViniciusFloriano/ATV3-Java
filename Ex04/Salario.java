package Ex04;
public class Salario {

	private double salarioBruto = 0;
	
	private static final double PERCENTUAL_IR = 0.11;
	private static final double PERCENTUAL_INSS = 0.08;
	private static final double PERCENTUAL_SINDICATO = 0.05;
	
	public Salario(double salarioBruto) {
		setSalarioBruto(salarioBruto);
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double calcularImpostoRenda() {
        return salarioBruto * PERCENTUAL_IR;
    }
	
	public double calcularInss() {
        return salarioBruto * PERCENTUAL_INSS;
    }
	
	public double calcularSindicato() {
        return salarioBruto * PERCENTUAL_SINDICATO;
    }
	
	public double calcularTotalDescontos() {
		return calcularImpostoRenda() + calcularInss() + calcularSindicato();
    }
	
	public double calcularSalarioLiquido() {
        double totalDescontos = calcularImpostoRenda() + calcularInss() + calcularSindicato();
        return salarioBruto - totalDescontos;
    }
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("+ Salário Bruto : R$ ");
		builder.append(salarioBruto);
		builder.append("\n- IR (11%) : R$ ");
		builder.append(calcularImpostoRenda());
		builder.append("\n- INSS (8%) : R$ ");
		builder.append(calcularInss());
		builder.append("\n- Sindicato (5%) : R$ ");
		builder.append(calcularSindicato());
		builder.append("\n= Salário Líquido : R$ ");
		builder.append(calcularSalarioLiquido());
		return builder.toString();
	}
	
}
