package pacote;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		setTaxaTransacao(0.005); //0.05%
		setTaxaAdministracao(2.50);
	}
	
	public boolean transacao(double quantia, Conta paraQuem) {
		System.out.println("Voc� n�o pode transferir!");
		return false;
	}
	
}
