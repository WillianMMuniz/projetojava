
public class ContaPoupanca extends Conta{


	@Override
	public void ImprimirExtrato() {
		System.out.println("\n====Extrato da conta poupan�a====\n");
		super.ImprimirExtrato();
		System.out.println("\n=================================\n");
	}
}
