package entities;

public class Ex10Notas {

	private String nomeAluno;
	private double nota1Semestre;
	private double nota2Semestre;

	public Ex10Notas(String nomeAluno, double nota1Semestre, double nota2Semestre) {
		this.nomeAluno = nomeAluno;
		this.nota1Semestre = nota1Semestre;
		this.nota2Semestre = nota2Semestre;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public double getNota1Semestre() {
		return nota1Semestre;
	}
	
	public double getNota2Semestre() {
		return nota2Semestre;
	}
	
	public  double media() {
		return (this.nota1Semestre + this.nota2Semestre) / 2;
	}
	
	

	
	
	

}
