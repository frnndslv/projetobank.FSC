package meuBanco;

public class ContaCorrente extends Conta{
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato contacorrente ===");
		super.imprimirInfocomuns();
	}	
	
}
