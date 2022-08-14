
public class ContaCorrente extends Conta {

	@Override
	public void ImprimirExtrato() {
		System.out.println("\n====Extrato da conta corrente====\n");
		super.ImprimirExtrato();
		System.out.println("\n=================================\n");
	}
}
