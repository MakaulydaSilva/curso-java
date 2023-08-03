package entities;

public class Account {

	private int numberAccount;
	private String holderAccount;
	private double balanceAccount;

	public Account(int numberAccount, String holderAccount) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
	}

	public Account(int numberAccount, String holderAccount, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
		deposit(initialDeposit);

	}

	// Não pode ser alterado
	public int getNumberAccount() {
		return numberAccount;
	}

	// Pode ser alterado
	public String getHolderAccount() {
		return holderAccount;
	}

	public void setHolderAccount(String holderAccount) {
		this.holderAccount = holderAccount;
	}

	// Não pode ser alterado
	public double getBalanceAccount() {
		return balanceAccount;
	}

	public void deposit(double amount) {
		this.balanceAccount += amount;
	}

	public void withdraw(double amount) {
		this.balanceAccount = (balanceAccount - amount) - 5.00;
	}

	public String toString() {
		return "Account " + numberAccount + ", Holder: " + holderAccount +
		 ", Balance: $ " + String.format("%.2f", balanceAccount);
	}

}
