package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Américo");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //Adicona um elemento na lista em determinado índice
		
		System.out.println(list.size()); //Mostra o tamanho da lista
		
		for (String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("---------------------------------------------");
		
		list.remove("Anna"); //Remove um elemento a partir da comparação de um valor com o outro
        list.removeIf(x -> x.charAt(0) == 'M'); // Defino uma função lambda (predicado) que retorna um valor verdadeiro ou falso, aqui eu digo para pegar todas os valores to tipo string que comece com a lentra M e remova-os da lista. 
        
        for (String nomes : list) {
			System.out.println(nomes);
		}
        
        System.out.println("---------------------------------------------");
        
        System.out.println("index of Bob: " + list.indexOf("Bob")); //Retorna o índice do elemento
        System.out.println("index of Marco: " + list.indexOf("Marco")); //Quando não se encontra o indice procurado o programa retornará o valor -1.
        
        System.out.println("---------------------------------------------");
        
        //                    Converto para stream / Faço a operação lambda para retornar todos os valores que comecem com a letra A // Depois eu retorno para o formato de lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Converto pra stream, faço a operação lambda e depois eu volto para o formato lista
        
        for (String nomes : result) {
			System.out.println(nomes);
		}
        
        System.out.println("---------------------------------------------");
        
        String nameWithA = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); //Para encontra o primeiro elemento que comece com a letra A.
        String nameWithJ = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); //Se ele não encontrar ele retornará nulo.
        
        System.out.println(nameWithA);
        System.out.println(nameWithJ);
	}

}
