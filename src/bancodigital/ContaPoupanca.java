package bancodigital;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato bancoDigitalOOP.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
