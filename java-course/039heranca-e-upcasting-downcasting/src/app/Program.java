package app;

import entitites.Account;
import entitites.BusinessAccount;
import entitites.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		// SOBREPOSIÇÃO
		Account acc6 = new Account(1005, "Hugo", 1000.0);
		
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1006, "Teresa", 1000.0, 0.01);
		acc7.withdraw(200.00);
		System.out.println(acc7.getBalance());
		
		// Usando o método super
		Account acc8 = new BusinessAccount(1007, "Rhuan", 1000.0, 500.0);
		
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());

		// BusinessAccount account = new BusinessAccount(); //Esta classe herdou todos
		// os dados da classe Account

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		// Eu posso pegar um objeto de subclasse e atribui-lo a uma variável da super
		// classe
		Account acc1 = bacc;

		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);

		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount)acc3;
		// esse if ira falhar pois acc3 não é uma instáncia de BusinessAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
