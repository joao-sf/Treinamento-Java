package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informaçõ9es do funcionario

		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numericos Reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_787_103.01;
		
		// Tipo Booleano
		boolean estaDeFerias = false; //true
		
		//tipos caracter
		char status = 'A';//ativo 
		
		// Dias de empresa
		System.out.println("O funciuonario: "+id +" Trabalha a: " +anosDeEmpresa * 365 +", dias nessa empresa.");
		
		//Numero de viagens
		
		System.out.println("O Funcionario: " +id +" Efetuou: " + numeroDeVoos/2 +", viagens pela empresa.");
		
		//Pontos por real
		
		System.out.println("O Funcionario: " +id +" Acumulou:" + pontosAcumulados/vendasAcumuladas +", pontos de milhas na empresa.");
		System.out.println(id+ ": ganha -> " + salario);
		System.out.println(id+ "esta de ferias ? " + estaDeFerias);
		System.out.println("Qual o estatus do funcionario " +id+"? "+status);			
	}

}
