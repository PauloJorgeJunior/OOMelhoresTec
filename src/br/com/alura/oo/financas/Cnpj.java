package br.com.alura.oo.financas;

public class Cnpj {

	private String cnpjCredor;
	
	private String valor;

	public Cnpj(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private int primeiroDigitoCorreto() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int primeiroDigitoVerificador() {
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	private int segundoDigitoCorreto() {
		// Calcula o segundo dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int segundoDigitoVerificador() {
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public String getCnpjCredor() {
		return this.cnpjCredor;
	}
	
	public String getValor(){
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
}
