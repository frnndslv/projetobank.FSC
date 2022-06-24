package meuBanco;

public class Cliente {
	
	protected String nome;
	protected String endereço;
	protected long numero_de_telefone;
	protected String email;
	
	

	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereço() {
		return endereço;
	}


	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}


	public long getNumero_de_telefone() {
		return numero_de_telefone;
	}


	public void setNumero_de_telefone(long numero_de_telefone) {
		this.numero_de_telefone = numero_de_telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
