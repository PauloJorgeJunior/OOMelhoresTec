package br.com.alura.oo.financas;

import java.util.HashMap;

public class BalancoEmpresa {

	private HashMap<Cnpj, Divida> dividas = new HashMap<Cnpj, Divida>();

	public void registraDivida(String credor, Cnpj cnpjCredor, double valor) {
		Divida divida = new Divida();
		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		dividas.put(cnpjCredor, divida);
	}

	public void pagaDivida(Cnpj cnpjCredor, double valor, String nomePagador, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			Pagamentos pagamento = new Pagamentos();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.getPagamentos().registra(pagamento);
		}
	}
}
