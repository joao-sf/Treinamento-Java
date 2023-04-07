package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		// usando o print sem ln para que vc coleoque a quebra de linha opnde achar nescessario.
		
		System.out.println("Bom");
		System.out.println("dia");
		//Printo com quebra de linha automatica
		
		System.out.printf("Mega sena:? %d %d %d %d %d %d %n",1,2,3,4,5,6 );
		// Usando formatação para dados variaveis.
		System.out.printf("Salario: %.1f%n", 1234.5678);
		// Usando formatação 1%%f para definir o limite de casas decimais (atentar que o sistema já arrendonda altomaticamente
		System.out.printf("Nome: %s %n", "João");
		//%S para usar strings
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome =  entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome =  entrada.nextLine();
		
		System.out.print("Digite o sua idade: ");
		int idade =  entrada.nextInt();
		
		System.out.printf(" %s %s tem %d anos.%n",
				nome, sobrenome, idade);
		entrada.close();
	}

}
