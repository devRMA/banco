package pacote;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		setTaxaTransacao(0.005); //0.05%
		setTaxaAdministracao(2.50);
	}
	
	public boolean transacao(double quantia, Conta paraQuem) {
		System.out.println("Você não pode transferir!");
		return false;
	}
	
}
