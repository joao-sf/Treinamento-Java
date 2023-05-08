package Controle;

public class For3 {
	public static void main(String[] args) {
		
// int i= 0 assim seria possível acessar a variável de fora do laço
		// for(;i<10;i++){
//		for(int i = 0; i<10; i++) {
//Desta maneira a variável não pode ser acessada fora do laço FOR
			//System.out.println(i);
		//}
		//}
//		System.out.println(i); 
//para acessar ela desta maneira é ->
// que sua declaração seja feita fora
	//}

		
		for(int i = 0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.printf("[%d %d]", i , j);
			}
			System.out.println();
		}
	}	
}
