package fundamentos;

public class Aritimetico {
	public static void main(String[] args) {
		System.out.println(2+3);
		System.out.println();
		
		var x = 34.56;
		double y =  2.2;
		
		// Operações simples com variavel
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println();
		
		
		
		// Operaçõpes com inteiros
		int a = 8;
		int b = 3; 
		
		//gerando inteiros
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);// Neste caso como é  divisão de inteiro 8/3 = 2 e sobra 2
		System.out.println();
		
		// Usando cast para transformar a variavel 'b' em um doubel e posteriormente em float e assim efetuar a divisão com casas descimais.
		System.out.println(a/(double)b);
		System.out.println(a/(float)b);
		System.out.println();
		
		// Operador % usado para obter o resto de uma divisão
		System.out.println(a%b);
		System.out.println(8%3);
		System.out.println();
		
		System.out.println(x+y-a*b);
		// 
	}

}
