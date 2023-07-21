package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data(03,04,1984);
		//d1.Dia = 03;
		//d1.Mes = 04;
		//d1.Ano = 1984;
		
		Data d2 =  new Data(22,03,1988);
		//d2.Dia = 22;
		//d2.Mes = 03;
		//d2.Ano = 1988;
		
		var d3 = new Data(26,12,2015);
		//d3.Dia = 26;
		//d3.Mes = 12;
		//d3.Ano = 2015; 
		
		Data d4 =  new Data();
		//d4.Dia = 01;
		//d4.Mes = 01;
		//d4.Ano = 1970;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
		System.out.println(d4.obterDataFormatada());
		
	}

}
