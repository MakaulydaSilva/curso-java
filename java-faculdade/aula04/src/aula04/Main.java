package aula04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
     
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe o caminho absoluto do arquivo texto: \n");
		String caminhoArquivo = scanner.nextLine();
		
		try {                                                     
			FileReader arquivo = new FileReader(caminhoArquivo);
			BufferedReader reader = new BufferedReader(arquivo);
			
			String linha = reader.readLine(); // lê a primeira linha
			while (linha != null) { 
			      System.out.printf("%\n", linha);
			      linha = reader.readLine(); // lê da segunda até a ultima linha
		
			}
			
			arquivo.close();
		} catch (IOException e) {
		
			System.out.printf("Erro na abertura do arquivo: %n", e.getMessage());
		
	}
    System.out.println();
	
	}
}
