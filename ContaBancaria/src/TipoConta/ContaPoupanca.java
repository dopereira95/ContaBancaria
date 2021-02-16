package TipoConta;

import java.util.Calendar;

import Aplicacao.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		 String s = "[Conta Poupanca ";
		   s += "Dia do Rendimento: " + diaRendimento;
		   s += "]";
		   s += super.toString();
		   
		
        return s;   
	 }
	
	
		public boolean CalcularNovoSaldo(double taxaRendimento) {
			
			Calendar hoje = Calendar.getInstance();
			
			if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
				// saldo += saldo + taxaRendimento;
			   this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			   return true;
			}
			return false;	
			
		}
	
	
}
