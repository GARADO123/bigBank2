package entidade;

public class Cliente {
    
	private String nome;
	private String Endereco;
	private double Renda;
	private double CPF;
	private String Profissao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public double getRenda() {
		return Renda;
	}
	public void setRenda(double renda) {
		Renda = renda;
	}
	public double getCPF() {
		return CPF;
	}
	public void setCPF(double cPF) {
		CPF = cPF;
	}
	public String getProfissao() {
		return Profissao;
	}
	public void setProfissao(String profissao) {
		Profissao = profissao;
	}
	public Cliente(String nome, String endereco, double renda, double cPF, String profissao) {
		super();
		this.nome = nome;
		Endereco = endereco;
		Renda = renda;
		CPF = cPF;
		Profissao = profissao;
	}
	  
	

}