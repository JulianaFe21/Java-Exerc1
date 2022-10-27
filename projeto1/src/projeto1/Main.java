package projeto1;

/*PROGRAMA QUE LEIA COM PRINTLN E PRINTF*/

public class Main {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Office desk";
		int idade = 30;
		int codigo = 5290;
		char gender = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double measure = 53.234567;
		
		System.out.println ("Produtos:");
		System.out.printf("%s, o qual o valor é %.2f%n", produto1,preco1);
		System.out.printf("%s, o qual o valor é %.2f%n", produto2, preco2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender %c.%n", idade, codigo, gender);
		System.out.printf("Valor %.2f%n", measure);
			
	}

}
