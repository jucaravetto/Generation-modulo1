package PacoteJava;
import java.util.*; //chamando toda a biblioteca

public class Vetor {
	
	public static void main(String[] args) {
		
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  OK
			� A soma dos n�meros pares digitados; OK
			� Os n�meros �mpares digitados; OK
			� A quantidade de n�meros �mpares digitados. OK
		 	*/
		Scanner ler = new Scanner(System.in);

		
		int [] vetorum = new int [6];
		int [] pares = {0,0,0,0,0,0};
		int [] vimpares = {0,0,0,0,0,0};
		
		int x, somapares, impares, quantimpares;
		
		x=0;
		somapares=0;
		quantimpares=0;
		
		for (x=0;x<6;x++)
		{ 
			System.out.println("\nDigite o n�mero por favor: ");
			vetorum[x] = ler.nextInt();
		}
		System.out.println("\n");
		
		System.out.println("\n O vetor �: \n");
		System.out.println("[ "+vetorum[0]+ "  " +vetorum[1]+ "  " +vetorum[2]+ "  " +vetorum[3]+ "  " +vetorum[4]+ "  " +vetorum[5]+" ]");
		//imprime o vetor bonitinho
		
		for (x=0;x<6;x++)
		{
			if((vetorum[x]%2)==0)
			{
				pares[x]=vetorum[x];
				
				somapares=somapares+pares[x];
				
			}
			else
			{
				vimpares[x]=vetorum[x];
				quantimpares= quantimpares+1;
				
			}
		}
		
		System.out.println("\nOs pares s�o: \n");
		System.out.println("[ "+pares[0]+ "  " +pares[1]+ "  " +pares[2]+ "  " +pares[3]+ "  " +pares[4]+ "  " +pares[5]+" ]");
		System.out.println("\nOs �mpares s�o: \n");
		System.out.println("[ "+vimpares[0]+ "  " +vimpares[1]+ "  " +vimpares[2]+ "  " +vimpares[3]+ "  " +vimpares[4]+ "  " +vimpares[5]+" ]");
		System.out.println("\n\nQuantidade de �mpares: "+quantimpares);
		System.out.println("\n\nSoma dos pares: "+somapares);	
	}

}
