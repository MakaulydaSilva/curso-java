import java.util.Scanner;

public class Exercicio04pt02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iniciaJogo = sc.nextInt();
		int terminaJogo = sc.nextInt();
		int duracao;
		
		if(iniciaJogo < terminaJogo) {
			duracao = terminaJogo - iniciaJogo;
		}else {
			duracao = 24 - iniciaJogo + terminaJogo;
		}
		
		if(duracao == 1) {
			System.out.println("Esta partida de beisebol durou " + duracao + " hora.");
		}else {
			System.out.println("Esta partida de beisebol durou " + duracao + " horas.");
		}
		
		
		sc.close();

	}

}
