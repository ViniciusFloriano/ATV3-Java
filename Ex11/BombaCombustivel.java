package Ex11;

public class BombaCombustivel {
	private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
    	setTipoCombustivel(tipoCombustivel);
    	setValorLitro(valorLitro);
    	setQuantidadeCombustivel(quantidadeCombustivel);
    }
    
    public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}

	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(double quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros > quantidadeCombustivel) {
            System.out.println("Não há combustível suficiente na bomba.");
        } else {
            quantidadeCombustivel -= litros;
            System.out.printf("Você abasteceu %.2f litros de %s.%n", litros, tipoCombustivel);
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros > quantidadeCombustivel) {
            System.out.println("Não há combustível suficiente na bomba.");
        } else {
            double valor = litros * valorLitro;
            quantidadeCombustivel -= litros;
            System.out.printf("Você deve pagar R$ %.2f pelo abastecimento de %.2f litros de %s.%n", valor, litros, tipoCombustivel);
        }
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
        System.out.printf("O valor do litro de %s foi alterado para R$ %.2f.%n", tipoCombustivel, valorLitro);
    }

    public void alterarCombustivel(String novoTipo) {
        this.tipoCombustivel = novoTipo;
        System.out.printf("O tipo de combustível foi alterado para %s.%n", tipoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
        System.out.printf("A quantidade de %s na bomba foi alterada para %.2f litros.%n", tipoCombustivel, quantidadeCombustivel);
    }

    public void statusBomba() {
        System.out.printf("Tipo: %s | Preço por litro: R$ %.2f | Quantidade na bomba: %.2f litros%n", tipoCombustivel, valorLitro, quantidadeCombustivel);
    }
}
