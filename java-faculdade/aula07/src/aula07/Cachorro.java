package aula07;

public class Cachorro {
	
	private String nome;
	
	public Cachorro(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//@override
	public boolean equals(Object obj) {
		Cachorro Cachorro02 = (Cachorro) obj;
		return this.nome.equals(Cachorro02.getNome());
	}
	
	public String toString() {
		
		return this.nome;
	}
	

}
