package aula07;

public class Main {

	public static void main(String[] args) {
		
	   Cachorro cachorro1 = new Cachorro("Max");
	   Cachorro cachorro2 = new Cachorro("Rex");
	   
	   
	 if(cachorro1.equals(cachorro2)) {
		 
		 System.out.println("São iguais!");
	 } else {
		 
		 System.out.println("São diferentes!");
	 }
	 
	 
	 System.out.println(cachorro1.toString());
	 System.out.println(cachorro2.toString());

	}
	
	

}
