package classe;

public class Data {
	int Dia;
	int Mes;
	int Ano;
	
	String  obterDataFormatada() {
		
		return String.format("%d/%d/%d",Dia, Mes,Ano);
		
	}
	
}
