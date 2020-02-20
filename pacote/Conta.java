package pacote;

//A classe não deve ser instanciada
//ela serve apenas de "molde" para as especialistas
//o abstract é usado para isso
public abstract class Conta {
	//Atributos
	private String nome;
	private double saldo = 0.0;
	private double taxaTransacao = 0.0;
	private double taxaAdministracao = 0.0;
	//Métodos
	public boolean saque(double dinheiro){
		if (dinheiro <= getSaldo()) {
			saldo -= dinheiro;
			return true;
		}else {
			return false;
		}
	}
	public void deposito(double quantia) {
		saldo += (quantia - getTaxaAdministracao());
		System.out.println("R$" + getSaldo() + " adicionado à conta do(a) " + getNome() + " com sucesso!");
	}
	public boolean transacao(double quantia, Conta paraQuem) {
		quantia += getTaxaTransacao();
		if (quantia <= getSaldo()) {
			paraQuem.deposito(quantia);
			saldo -= (quantia + getTaxaTransacao());
			return true;
		}else {
			return false;
		}
	}
	//Métodos de acesso
	public double getSaldo() {
		return saldo;
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
