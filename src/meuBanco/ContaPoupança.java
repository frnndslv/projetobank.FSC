package meuBanco;

public class ContaPoupança extends Conta {
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta Poupança ===");
		super.imprimirInfocomuns();
		
	}
}
