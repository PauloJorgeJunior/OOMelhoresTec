package br.com.alura.oo.financas;

import java.util.ArrayList;
import java.util.Calendar;

public class Pagamento{

	private String pagador;
    private String cnpjPagador;
    private double valor;
    private Calendar data;
	private double valorPago;
	
    public String getPagador() {
        return this.pagador;
    }
    public void setPagador(String pagador) {
        this.pagador = pagador;
    }
    public String getCnpjPagador() {
        return this.cnpjPagador;
    }
    public void setCnpjPagador(String cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }
    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Calendar getData() {
        return this.data;
    }
    public void setData(Calendar data) {
        this.data = data;
    }
	
    private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}
    
    public void registra(Pagamento pagamento){
    	this.add(pagamento);
    	this.paga(pagamento.getValor());
    }
	
    public ArrayList<Pagamentos> pagamentosAntesDe(Calendar data) {
		ArrayList<Pagamentos> pagamentosFiltrados = new ArrayList<Pagamentos>();
		for (Pagamentos pagamento : this) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamentos> pagamentosComValorMaiorQue(double valorMinimo) {
		ArrayList<Pagamentos> pagamentosFiltrados = new ArrayList<Pagamentos>();
		for (Pagamentos pagamento : this) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamentos> pagamentosDo(String cnpjPagador) {
		ArrayList<Pagamentos> pagamentosFiltrados = new ArrayList<Pagamentos>();
		for (Pagamentos pagamento : this) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
}
