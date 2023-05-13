package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		/*Calcular a media dos alunos de uma turma cujo a quantidade
		   de alunos e notas na sala é indeterminado*/
		Scanner entrada = new Scanner(System.in);

		float nota = 0;
		float media = 0;
		float result = 0;
		int i = 0;
		//float contador = 0;
		//inicio
		System.out.println("Entre com as notas do aluno, ou -1 para finalizar.");
		nota = entrada.nextFloat();


		while ( nota != -1) {			
			if (nota >=0 && nota <= 10 ){					
				nota = entrada.nextFloat();				

				media = media + nota;
				i++;
				System.out.println("Favor entrar com a proxiam nota ou"
						+ " entre com -1 para finalizar");
			} else if(nota != -1){
				System.out.println("Entre com uma nota valida");
			}
		}
		result = media / i;
		System.out.println("A media final do aluno é:" + result);	

		entrada.close();


	}

}
