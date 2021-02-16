package Aplicacao;

import TipoConta.ContaEspecial;
import TipoConta.ContaPoupanca;

public class Teste {

	
	
	public static void main(String[] args) {
		
		System.out.println("*** Teste Conta Bancaria ***");
        
		ContaBancaria ContaSimples = new ContaBancaria();
		ContaSimples.setNomeCliente("ClienteContaSimples " );
		ContaSimples.setNumConta("12345 ");
		
		
		System.out.println(ContaSimples);
		
		ContaSimples.depositar(100);
		System.out.println("Dinheiro Depositado: "+ ContaSimples.getSaldo());
		
		
		realizarSaque(ContaSimples, 50);
		realizarSaque(ContaSimples, 70);
	
        System.out.println("\n*** Teste Conta Poupança ***");
        
		ContaPoupanca ContaPoupanca = new ContaPoupanca();
		ContaPoupanca.setNomeCliente("ClienteContaPoupança " );
		ContaPoupanca.setNumConta("12345 ");
		ContaPoupanca.setDiaRendimento(7);
		
		System.out.println(ContaPoupanca);
		
		ContaPoupanca.depositar(100);
		System.out.println("Dinheiro Depositado: "+ ContaPoupanca.getSaldo());
		
		
		realizarSaque(ContaPoupanca, 50);
		realizarSaque(ContaPoupanca, 70);
		
		
		if(ContaPoupanca.CalcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado novo saldo de: "+ContaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado.");
		}
		System.out.println(ContaPoupanca);
		
System.out.println("\n*** Teste Conta Especial ***");
        
        ContaEspecial ContaEspecial = new ContaEspecial();
        ContaEspecial.setNomeCliente("ClienteContaEspecial " );
		ContaEspecial.setNumConta("12345 ");
		ContaEspecial.setLimite(50);
		
		System.out.println(ContaEspecial);
		
		ContaEspecial.depositar(100);
		System.out.println("Dinheiro Depositado: "+ ContaEspecial.getSaldo());
		
		
		realizarSaque(ContaEspecial, 50);
		realizarSaque(ContaEspecial, 70);
		realizarSaque(ContaEspecial, 80);
		
		System.out.println(ContaEspecial);
	}
	
		private static void realizarSaque(ContaBancaria conta, double valor) {
			if(conta.sacar(valor)) {
				System.out.println("Saque efetuado com sucesso, novo saldo de: "+ conta.getSaldo());
			}else {
				System.out.println("Saldo insuficiente para saque de: "+ valor);
			}
		}

	
}


