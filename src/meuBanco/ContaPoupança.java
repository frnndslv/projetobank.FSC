package meuBanco;

public class ContaPoupan�a extends Conta {
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta Poupan�a ===");
		super.imprimirInfocomuns();
		
	}
}
