package br.com.htcursos.produto;

public class Produto{

	private double valorUnitario;
	private String descricao;
	
	Produto(){
	}

	public Produto(String descricao, double valorUnitario) throws ValorInvalido {
		verificarSeValorMenorQueZero(valorUnitario);
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}
	
	private void verificarSeValorMenorQueZero(double valorUnitario) throws ValorInvalido {
		if(valorUnitario < 0) {
			throw new ValorInvalido();
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}
}
