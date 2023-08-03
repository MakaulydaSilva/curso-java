package entities;

public class Ex03Pessoas {
    
	private String pessoa;
	private int idade;
	private double altura;
	
	public Ex03Pessoas(String pessoa, int idade, double altura) {
		this.pessoa = pessoa;
		this.idade = idade;
		this.altura = altura;
	}

	public String getPessoa() {
		return pessoa;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}

}
