package meuBanco;

public abstract class Conta implements Iconta {
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	
	
	protected int agencia;
	protected int numerodaConta;
	protected double saldo;
	protected Cliente clienteDaConta;
	
	
	public Conta() {

	this.agencia = AGENCIA_PADRAO;
	this.numerodaConta = SEQUENCIAL++;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
		
	}
	@Override
	public void transferir(double valor, Conta contadestino) {
		this.sacar(valor);
		contadestino.depositar(valor);
		
		
	} 
	@Override
	public void imprimirInfdoCliente() {
		
		
	}



	
	public int getAgencia() {
		return this.agencia;
	}
	public int getNumerodaConta() {
		return this.numerodaConta;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public Cliente getCliente() {
		return this.clienteDaConta;
	}
	
	public void setCliente(Cliente clienteDaConta) {
		this.clienteDaConta = clienteDaConta;
	}
	
	protected void imprimirInfocomuns() {
		System.out.println();
		System.out.println("Nome do Cliente: " + this.clienteDaConta.getNome());
		System.out.println(String.format("Agencia: %d " , this.agencia));
		System.out.println(String.format("Numero:   %d  " , this.numerodaConta));
		System.out.println(String.format(" Saldo: %.2f " , this.saldo));
		
	}

}

