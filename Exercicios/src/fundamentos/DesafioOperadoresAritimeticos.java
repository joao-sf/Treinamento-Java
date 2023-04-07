package fundamentos;

public class DesafioOperadoresAritimeticos {
	public static void main(String[] args) {
		/*Separando variavel por variavel:
		 * 	double a = (6*(3+2));
			a = Math.pow(a,2);
			double b = 3*2;
			a = a/b;
			b = ((1-5)*(2-7));			
			b = b/2;
			b = Math.pow(b, 2);
			a = a-b;
			a = Math.pow(a, 3);
			b = Math.pow(10,3);
			a = a/b;
			System.out.println ((int) a);
		 *
		
		*	
		*Efetuando a conta toda em um comando sô.
		*/
		System.out.println ((int)((Math.pow(((Math.pow((6*(3+2)),2))/(3*2))-(Math.pow((((1-5)*(2-7))/2),2)),3))/Math.pow(10,3)));
	}
}
