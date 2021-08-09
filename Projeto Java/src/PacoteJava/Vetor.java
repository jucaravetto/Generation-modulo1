package PacoteJava;
import java.util.*; //chamando toda a biblioteca

public class Vetor {
	
	public static void main(String[] args) {
		
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  OK
			• A soma dos números pares digitados; OK
			• Os números ímpares digitados; OK
			• A quantidade de números ímpares digitados. OK
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
			System.out.println("\nDigite o número por favor: ");
			vetorum[x] = ler.nextInt();
		}
		System.out.println("\n");
		
		System.out.println("\n O vetor é: \n");
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
		
		System.out.println("\nOs pares são: \n");
		System.out.println("[ "+pares[0]+ "  " +pares[1]+ "  " +pares[2]+ "  " +pares[3]+ "  " +pares[4]+ "  " +pares[5]+" ]");
		System.out.println("\nOs ímpares são: \n");
		System.out.println("[ "+vimpares[0]+ "  " +vimpares[1]+ "  " +vimpares[2]+ "  " +vimpares[3]+ "  " +vimpares[4]+ "  " +vimpares[5]+" ]");
		System.out.println("\n\nQuantidade de ímpares: "+quantimpares);
		System.out.println("\n\nSoma dos pares: "+somapares);	
	}

}
