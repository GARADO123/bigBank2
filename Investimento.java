package entidade;

public class Investimento {
	
	
	public void Investir(MovimBancario neymar , double val) {
        if (val <= neymar.Getsaldo_atual()) {
        	
             -= val;
            System.out.println("Valor tranferido com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}    
            
       
	}

	
}