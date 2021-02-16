package Aplicacao;

public class ContaBancaria{
	   
	   private String nomeCliente, numConta, tipoConta, dataAbertura;
	   private double saldo;

	   
	public String getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}


	public String getDataAbertura() {
		return dataAbertura;
	}


	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getNumConta() {
		return numConta;
	}


	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}


	public  double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	   
	   
	   @Override
	public String toString() {
	   String s = "[ContaSimples ";
	   s += "NomeCliente: "+ nomeCliente;
	   s += "NumConta: "+ numConta;
	   s += "Saldo :  "+ saldo;
	   s += "]";
	   return s;
	   }


	public void depositar(double valor) {
		   saldo += valor;
	   }
	   
	   public boolean sacar(double valor) {
		   if((saldo - valor) >= 0) {
			   	saldo -= valor;
		        return true;
		   }
		   return false;
	}
	}

