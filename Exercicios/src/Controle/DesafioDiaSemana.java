package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
public static void main(String[] args) {
	//Domingo -> 1
	// quarta -> 4
	//terça - > 3
	Scanner entrada = new Scanner (System.in);
	System.out.println("Entre com o dia da semana.");
	
	String valor = entrada.next();
	
	if(valor.equalsIgnoreCase("Domingo") ) {
		System.out.println("1");
	}if(valor.equalsIgnoreCase("Segunda-Feira") ) {
		System.out.println("2");
	}if(valor.equalsIgnoreCase("Terça-Feira") ) {
		System.out.println("3");
	}if(valor.equalsIgnoreCase("Quarta-Feira") ) {
		System.out.println("4");
	}if(valor.equalsIgnoreCase("Quinta-Feira") ) {
		System.out.println("5");
	}if(valor.equalsIgnoreCase("Sexta") ) {
		System.out.println("6");
	}if(valor.equalsIgnoreCase("Sabado") ) {
		System.out.println("7");
	}
	
	System.out.println("Fim!");
	entrada.close();
	}	
}

