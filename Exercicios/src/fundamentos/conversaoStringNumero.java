package fundamentos;

import java.util.Locale;

import javax.swing.JOptionPane;

public class conversaoStringNumero {
public static void main(String[] args) {
	Locale.setDefault(new Locale("en","US"));
	String valor1 = JOptionPane.showInputDialog
			("Digite o primeiro Numero!");
	String valor2 = JOptionPane.showInputDialog
			("Digite o segundo Numero!");
	String valor3 = JOptionPane.showInputDialog
			("Digite o terceniro Numero!");
	
	System.out.println(valor1+valor2+valor3);
	
	
	double numer1=Double.parseDouble(valor1);
	double numer2=Double.parseDouble(valor2);
	double numer3=Double.parseDouble(valor3);
	
	double soma=numer1+numer2+numer3;
	
	System.out.println("Soma é " + soma);
	System.out.println("Media é " + soma/3);
	
	
	
}
}
