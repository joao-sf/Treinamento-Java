package Controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		// if(boolean)
		// while(boolean)
		// for(;boolean;)
		// Quando não tem Break, caso entre em qualquer case que não seja o ultimo irá executar todos os cases abaixo
		String faixa = "VERMELHA";
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marron":
			System.out.println("Sei o Tekki-Shodan...");
		case "roxa":
			System.out.println("Sei o Heian-Godan...");
		case "verde":
			System.out.println("Sei o Heian-Yodan...");
		case "laranja":
			System.out.println("Sei o Heian-Sandan...");
		case "vermelha":
			System.out.println("Sei o Heian-Nidan...");
		case "amarela":
			System.out.println("Sei o Heian-Shodan");		
		}
	}

}
