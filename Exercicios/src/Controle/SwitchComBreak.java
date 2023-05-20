package Controle;

import java.util.Scanner;

public class SwitchComBreak {
public static void main(String[] args) {

	String conceito = " ";
	Scanner entrada=new Scanner(System.in);
	System.out.println("Entre com a nota do aluno.");
	int nota = entrada.nextInt();
	switch (nota) {
	case 10:
		conceito = "A+";
		break;
	case 9:
		conceito = "A";
		break;
	case 8:
		conceito = "B+";
		break;
	case 7:
		conceito = "B";
		break;
	case 6:
		conceito = "C+";
		break;
	case 5:
		conceito = "C";
		break;
	case 4:
		conceito = "D+";
		break;
	case 3:
		conceito = "D";
		break;
	case 2:
		conceito = "E+";
		break;
	case 1:
		conceito = "E";
		break;
	case 0:
		conceito = "F";
		break;
	default:
		conceito = "Conceito não localizado.";
	}		
	System.out.println("O conceito do aluno é: "+ conceito );
	entrada.close();
	if(nota > 0 && nota <= 10 ) {
	if(nota >= 10) {
		System.out.println("Parabéns!, você foi aprovado com louvor.");
	}else if(nota >= 6){
			System.out.println("Aluno Aprovado!");
	}else if(nota > 3) {
		System.out.println("Aluno de recuperação!");
		}else
			System.out.println("Aluno Reprovado!");
	}else
		System.out.println("Entre com uma nota valida.");
	}	
}


