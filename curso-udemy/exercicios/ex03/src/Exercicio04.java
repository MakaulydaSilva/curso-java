import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaIniciaJogo = sc.nextInt();
		int horaTerminaJogo = sc.nextInt();
		int duracao;
		
		if(horaIniciaJogo < horaTerminaJogo) {
			duracao = horaTerminaJogo - horaIniciaJogo;
		}
		else {
			duracao = 24 - horaIniciaJogo + horaTerminaJogo;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
		
		sc.close();

	}

}
