import java.util.Scanner;

public class GerenciaConta {
	
	private float saldoAtual = 15000f;

	public static void main(String[] args) {
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Entre um valor para acrescentar ao saldo");
		float novoValor = inputDevice.nextFloat();
		
		try {
			float valorTotal = new GerenciaConta().adicionaValor(novoValor);
			System.out.println("Valor atualizado" + valorTotal);
			
			} catch( SaldoContaException e) {
				//Tratamento da exceção
                System.out.println("Conta ultrapassou os 20000");
                }
	}
		
	
	public float adicionaValor(float montante) throws SaldoContaException {
		float total = saldoAtual + montante;
		if(total > 20000) {
			throw new SaldoContaException(total);
		}
		
		return total;
	}

}
