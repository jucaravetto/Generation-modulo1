package PacoteJava;
import java.util.*; //chamando toda a biblioteca
public class Exerc�cioLaco1 {

	
	public static void main(String[] args) {
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		System.out.print("\nOl�! Vamos descobrir qual n�mero � maior!\n");
		
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		//limpando vari�veis
		numero1 = 0;
		numero2 = 0;
		numero3 = 0;
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		numero1 = ler.nextInt();
		
		
		System.out.println("\nEntre com o segundo n�mero: ");
		numero2 = ler.nextInt();		
		
		
		System.out.println("\nEntre com o terceiro n�mero: ");
		numero3 = ler.nextInt();
		
		
		
		if(numero2<numero1 && numero3<numero1)
		{
			System.out.print("\nO n�mero 1 � o maior");
			System.out.print("\nN1: "+ numero1+ " ."); 
		}
		else if(numero1<numero2 && numero3<numero2) 
		{
			System.out.print("\nO n�mero 2 � o maior");
			System.out.print("\nN2: "+ numero2+ " ."); 
			
		}
		else
		{
			System.out.print("\nO n�mero 3 � o maior");
			System.out.print("\nN3: "+ numero3+ " .");
			
		}
		
		System.out.print("\nObrigada e at� � pr�xima!");
	}
}
