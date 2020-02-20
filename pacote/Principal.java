package pacote;

public class Principal {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		ContaVip contaVip = new ContaVip();
		
		
		contaCorrente.setNome("Robert");
		contaPoupanca.setNome("Fernando");
		contaVip.setNome("Thaís");
		
		
		
		contaCorrente.deposito(500);
		contaPoupanca.deposito(500);
		contaVip.deposito(500);
		
		if (contaCorrente.saque(100)) {
			System.out.println("Saldo atual do(a) " + contaCorrente.getNome() + ": R$" + contaCorrente.getSaldo());
		}
		else {
			System.out.println("Saldo insuficiente!");
		}
		
		if (contaVip.transacao(100, contaCorrente)) {
			System.out.println("Tranferência realizado com sucesso!");
			System.out.println("Saldo atual do(a) " + contaVip.getNome() + ": R$" + contaVip.getSaldo());
			System.out.println("Saldo atual do(a) " + contaCorrente.getNome() + ": R$" + contaCorrente.getSaldo());
		}
	}
}