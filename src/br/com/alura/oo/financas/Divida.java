package br.com.alura.oo.financas;

public class Divida {

	private double total;

	private String credor;
	private Cnpj cnpjCredor;
	private Pagamentos pagamentos = new Pagamentos();

	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Pagamentos getPagamentos() {
		return pagamentos;
	}

}
