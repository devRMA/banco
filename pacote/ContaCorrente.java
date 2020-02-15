package pacote;

public class ContaCorrente extends Conta{
	public ContaCorrente() {
		setTaxaTransacao(0.01); //1%
		setTaxaAdministracao(5.00); //5 reais por mês
	}
	
}
