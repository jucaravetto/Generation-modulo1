package PacoteJava;
import java.util.*; //chamando toda a biblioteca
public class ExercicioLaco2 {
public static void main(String[] args) {
		
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		System.out.print("\nOl�! Vamos descobrir qual n�mero � maior!\n");
		
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3, maior, medio, menor;
		
		//limpando vari�veis
		numero1 = 0;
		numero2 = 0;
		numero3 = 0;
		maior = 0;
		medio = 0;
		menor = 0;
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		numero1 = ler.nextInt();
		
		
		System.out.println("\nEntre com o segundo n�mero: ");
		numero2 = ler.nextInt();		
		
		
		System.out.println("\nEntre com o terceiro n�mero: ");
		numero3 = ler.nextInt();
		
		
		//come�o do maior
		if(numero2<numero1 && numero3<numero1)
		{
			maior = numero1;
			//System.out.print("\nO n�mero 1 � o maior");
			//System.out.print("\nN1: "+ numero1+ " ."); 
		}
		else if(numero1<numero2 && numero3<numero2) 
		{
			maior = numero2;
			//System.out.print("\nO n�mero 2 � o maior");
			//System.out.print("\nN2: "+ numero2+ " ."); 
			
		}
		else if(numero1<numero3 && numero2<numero3)
		{
			maior = numero3;
			//System.out.print("\nO n�mero 3 � o maior");
			//System.out.print("\nN3: "+ numero3+ " .");
			
		}
		//fim do maior
		
		//come�o do menor
		if(numero2>numero1 && numero3>numero1)
		{
			menor = numero1;
			//System.out.print("\nO n�mero 1 � o maior");
			//System.out.print("\nN1: "+ numero1+ " ."); 
		}
		else if(numero1>numero2 && numero3>numero2) 
		{
			menor = numero2;
			//System.out.print("\nO n�mero 2 � o maior");
			//System.out.print("\nN2: "+ numero2+ " ."); 
			
		}
		else if(numero1>numero3 && numero2>numero3)
		{
			menor = numero3;
			//System.out.print("\nO n�mero 3 � o maior");
			//System.out.print("\nN3: "+ numero3+ " .");
			
		}
		//fim do menor
		
		//come�o do m�dio
		
		if(maior==numero1 && menor==numero2)
		{
			medio=numero3; 
			//System.out.print("\nO n�mero 1 � o maior");
			//System.out.print("\nN1: "+ numero1+ " ."); 
		}
		else if(maior==numero2 && menor==numero1)
		{
			medio=numero3; //ok
			//System.out.print("\nO n�mero 1 � o maior");
			//System.out.print("\nN1: "+ numero1+ " ."); 
		}
		else if(maior==numero2 && menor==numero3) //fazer a condi��o inversa tamb�m
		{
			medio=numero1;
			//System.out.print("\nO n�mero 2 � o maior");
			//System.out.print("\nN2: "+ numero2+ " ."); 
			
		}
		else if(maior==numero3 && menor==numero2) 
		{
			medio=numero1;//ok
			//System.out.print("\nO n�mero 2 � o maior");
			//System.out.print("\nN2: "+ numero2+ " ."); 
			
		}
		else if(maior==numero1 && menor==numero3)//fazer a condi��o inversa tamb�m
		{
			medio = numero2;
			//System.out.print("\nO n�mero 3 � o maior");
			//System.out.print("\nN3: "+ numero3+ " .");
			
		}
		else if(maior==numero3 && menor==numero1)
		{
			medio = numero2;//ok
			//System.out.print("\nO n�mero 3 � o maior");
			//System.out.print("\nN3: "+ numero3+ " .");
			
		}
		//fim do medio
		
		System.out.print("\nA ordem crescente �: \n");
		
		System.out.print("\n");
		System.out.print(menor);
		System.out.print("\n");
		System.out.print(medio);
		System.out.print("\n");
		System.out.print(maior);
		
		System.out.print("\nObrigada e at� � pr�xima!");
	}
}

