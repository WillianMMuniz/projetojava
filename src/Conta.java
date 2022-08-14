
public abstract class Conta implements IConta{
	
	protected static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;
		
	}
	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	@Override
	public void ImprimirExtrato() {
	
		System.out.println(String.format("Agência %d: ", this.agencia));
		System.out.println(String.format("número da conta %d: ", this.numero));
		System.out.println(String.format("Saldo %.2f: ", this.saldo));
		//System.out.println(String.format("Deposito %.2f: ", this.depositar(saldo)));
		//System.out.println(String.format("Saque %.2f: ", this.sacar()));
		System.out.println(String.format("Saldo depois das operações %.2f: ", this.saldo));
		
	}

	
}
