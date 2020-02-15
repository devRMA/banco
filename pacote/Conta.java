package pacote;

public class Conta {
	//Atributos
	private String nome;
	private double saldo = 0.00;
	private double taxaTransacao = 0.0;
	private double taxaAdministracao = 0.0;
	
	//Métodos
	public boolean saque(double dinheiro){
		if (dinheiro <= getSaldo()) {
			setSaldo(getSaldo() - dinheiro);
			return true;
		}else {
			return false;
		}
	}	
	
	public void deposito(double quantia) {
		setSaldo(quantia - getTaxaAdministracao());
		System.out.println("R$" + getSaldo() + " adicionado à conta do(a) " + getNome() + " com sucesso!");
	}
	
	public boolean transacao(double quantia, Conta paraQuem) {
		quantia += getTaxaTransacao();
		if (quantia <= getSaldo()) {
			paraQuem.setSaldo(paraQuem.getSaldo() + (quantia - getTaxaTransacao()));
			saldo -= quantia;
			return true;
		}else {
			return false;
		}
	}

	
	//Métodos de acesso
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTaxaTransacao() {
		return taxaTransacao;
	}
	public void setTaxaTransacao(double taxaTransacao) {
		this.taxaTransacao = taxaTransacao;
	}
	public double getTaxaAdministracao() {
		return taxaAdministracao;
	}
	public void setTaxaAdministracao(double taxaAdministracao) {
		this.taxaAdministracao = taxaAdministracao;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
