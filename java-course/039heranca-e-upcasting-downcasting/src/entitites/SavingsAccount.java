package entitites;

//Esta classe não pode ser herdada por outra classe
public final class SavingsAccount extends Account{

	private Double interesRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interesRate) {
		super(number, holder, balance);
		this.interesRate = interesRate;
	}

	public Double getInteresRate() {
		return interesRate;
	}

	public void setInteresRate(Double interesRate) {
		this.interesRate = interesRate;
	}
	
	public void updateBalance() {
		balance += balance * interesRate;
	}
	
	@Override
	//Não permito que o método seja sobreposto com a palavra final
	public final void withdraw(double amount) {
		balance -= amount;
				
	}
	
}
