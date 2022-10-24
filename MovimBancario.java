package entidade;

import java.util.Scanner;

public class MovimBancario {
	
	private double valor;
	
	
	
	
	public void Settransferir(double transfere) {
	
		if(transfere <= valor) {
			this.valor -= transfere;
			System.out.println("Valor tranferido com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	
	public void Setsacar(double sacar) {
		
		if(sacar <= valor) {
			this.valor-=sacar;
			System.out.println("Valor saca com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		
	}
	
	public double Getsaldo_atual() {
		
		return this.valor;
	}
	public void Setdepos(double depositar) {
		
		this.valor+=depositar;
		
	}
	
}
