package meuBanco;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco nome = new Banco();
		nome.setNomedoBanco("FSC");
		
		List<Conta> Contas = new ArrayList<>();
		
		Cliente novoCliente= new Cliente(); 
		novoCliente.setNome("Carlos");
		novoCliente.setEmail("chvs@gmail.com");
		  
		Conta Cc= new ContaCorrente();
		Cc.depositar(10);
		
		Conta Cp = new ContaPoupança();
		Cc.transferir(10, Cp);
		
		
		Cc.setCliente(novoCliente);
		Cp.setCliente(novoCliente);
		
		Contas.add(Cc);
		Contas.add(Cp);
		nome.setContas(Contas);
		
		System.out.println(nome.getNomedoBanco());
		System.out.println(nome.getContas().get(0).getCliente().getNome());
		
		
		Cc.imprimirExtrato();
		Cp.imprimirExtrato();
		
	}

}
