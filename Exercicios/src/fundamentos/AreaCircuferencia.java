package fundamentos;

public class AreaCircuferencia {
	public static void main(String[] args) {
		double Raio = 3.4;
		final double Pi = 3.14159;
		
		double Area = Pi * Raio*Raio;
		
		System.out.println(Area);
		
		Raio = 10;
		Area = Pi * Raio * Raio;
		System.out.println("A area da circufenrecia é = " + Area + "m².");
			}
}
