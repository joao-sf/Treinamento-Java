package Controle;

public class DesafioFor {
	public static void main(String[] args) {
		// fazer um laço de repetição que inicia com "#" e conclua com "####" sem usar valores numéricos para o controle
		
		for ( String i = "#"; !i.equals("######"); i += "#") {
			System.out.println(i);}
	}

}
