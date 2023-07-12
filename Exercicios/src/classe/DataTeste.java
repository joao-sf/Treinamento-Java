package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.Dia = 03;
		d1.Mes = 04;
		d1.Ano = 1984;
		
		Data d2 =  new Data();
		d2.Dia = 22;
		d2.Mes = 03;
		d2.Ano = 1988;
		
		var d3 = new Data();
		d3.Dia = 26;
		d3.Mes = 12;
		d3.Ano = 2015; 
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
		
	}

}
