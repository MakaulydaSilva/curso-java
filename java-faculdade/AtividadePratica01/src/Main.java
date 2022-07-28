
import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.InputStream;

import java.io.OutputStream;

import java.util.Scanner;


public class Main { 

	public static void main(String[] args) throws IOException { 
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe o nome do arquivo:\n");
		String path = scanner.nextLine();

		InputStream is = null;
		OutputStream os = null;

		try {

			is = new FileInputStream(path);

			os = new FileOutputStream("copia de" + path);

			byte[] buffer = new byte[1024];

			int length = is.read();

			while((length = is.read(buffer)) > 0) {

				os.write(buffer, 0, length);

			}

		}catch (Exception e) {

			System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());

		} finally {

			is.close();

			os.close();

		}

	}

}


