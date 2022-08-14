
public class Principal {
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		cc.depositar(100);
		cc.transferir(50, cp);
		cc.sacar(25);
		
		cc.ImprimirExtrato();
		cp.ImprimirExtrato();
		
	}
}
