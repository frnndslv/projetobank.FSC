package meuBanco;

public class ContaPoupanša extends Conta {
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta Poupanša ===");
		super.imprimirInfocomuns();
		
	}
}
