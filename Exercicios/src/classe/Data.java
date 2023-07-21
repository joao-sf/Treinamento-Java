package classe;

public class Data {
	int Dia;
	int Mes;
	int Ano;
	
	Data(int diaC,int mesC,int anoC){
		Dia = diaC;
		Mes = mesC;
		Ano = anoC;
	}
	
	Data(){
		Dia = 01;
		Mes = 01;
		Ano = 1970;
	}
	String  obterDataFormatada() {
		
		return String.format("%d/%d/%d",Dia, Mes,Ano);
		
	}
	
}
