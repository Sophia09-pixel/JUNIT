
public class Conta {

	private Double saldo;

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public void verificaSaldo() {
		System.out.println("Valor do Saldo: " + getSaldo());
	}

}
