package meuBanco;

import java.util.List;

public class Banco { 
	private String nomedoBanco;

	private List<Conta> Contas;
	
	public List<Conta> getContas() {
		return Contas;
	}
	public void setContas(List<Conta> contas) {
		this.Contas = contas;
	}
	public String getNomedoBanco() {
		return nomedoBanco;
	}
	public void setNomedoBanco(String nomedoBanco) {
		this.nomedoBanco = nomedoBanco;
	}
	
	
	}



