package pacote;

public class Conta {
	//Atributos
	private String nome;
	private double saldo = 0.0;
	private double taxaTransacao = 0.0;
	private double taxaAdministracao = 0.0;
	//M�todos
	public boolean saque(double dinheiro){
		if (dinheiro <= getSaldo()) {
			saldo = (getSaldo() - dinheiro);
			return true;
		}else {
			return false;
		}
	}
	public void deposito(double quantia) {
		saldo = (quantia - getTaxaAdministracao());
		System.out.println("R$" + getSaldo() + " adicionado � conta do(a) " + getNome() + " com sucesso!");
	}
	public boolean transacao(double quantia, Conta paraQuem) {
		quantia += getTaxaTransacao();
		if (quantia <= getSaldo()) {
			paraQuem.saldo = (paraQuem.getSaldo() + (quantia - getTaxaTransacao()));
			saldo -= quantia;
			return true;
		}else {
			return false;
		}
	}
	//M�todos de acesso
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
