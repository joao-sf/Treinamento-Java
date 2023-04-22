package Controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		//if(...) sentença, ou {}
		//while(....) sentença, ou {}
		// for (....;...;...) sentença, ou {}
		
		/* do {} while(...); estrutura diferente das demais estruturas de controle*/
		
		Scanner entrada = new Scanner(System.in);
		
		String texto ="";
		
		do {
			System.out.println( "Você presica falar "
					+ "as palvras mágicas...");
			
			System.out.println("quer sair ?");
			texto = entrada.nextLine();
					
		}while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");
		entrada.close();
	}

}
