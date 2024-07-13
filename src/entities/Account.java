package entities;

public class Account {

	private int contaNum;
	private String nomeTitular;
	private double saldo;

	public Account() {

	}

	public Account(int contaNum, String nomeTitular, double saldo) {
		this.contaNum = contaNum;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public Account(int contaNum, String nomeTitular) {
		this.contaNum = contaNum;
		this.nomeTitular = nomeTitular;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getContaNum() {
		return contaNum;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}

	public void saque(double valorSaque) {
		saldo -= (valorSaque + 5);
	}

	public String toString() {
		return "Account " + contaNum + ", Holder: " + nomeTitular + ", Balance: $" + String.format("%.2f", saldo);
	}
}