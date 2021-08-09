package PacoteJava;
import java.util.*; //chamando toda a biblioteca
public class ExercicioLaco2 {
public static void main(String[] args) {
		
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		System.out.print("\nOlá! Vamos descobrir qual número é maior!\n");
		
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3, maior, medio, menor;
		
		//limpando variáveis
		numero1 = 0;
		numero2 = 0;
		numero3 = 0;
		maior = 0;
		medio = 0;
		menor = 0;
		
		System.out.println("\nEntre com o primeiro número: ");
		numero1 = ler.nextInt();
		
		
		System.out.println("\nEntre com o segundo número: ");
		numero2 = ler.nextInt();		
		
		
		System.out.println("\nEntre com o terceiro número: ");
		numero3 = ler.nextInt();
		
		
		//começo do maior
		if(numero2<numero1 && numero3<numero1)
		{
			maior = numero1;
			//System.out.print("\nO número 1 é o maior");
			//System.out.print("\nN1: "+ numero1+ " ."); 
		}
		else if(numero1<numero2 && numero3<numero2) 
		{
			maior = numero2;
			//System.out.print("\nO número 2 é o maior");
			//System.out.print("\nN2: "+ numero2+ " ."); 
			
		}
		else if(numero1<numero3 && numero2<numero3)
		{
			maior = numero3;
			//System.out.print("\nO número 3 é o maior");
			//System.out.print("\nN3: "+ numero3+ " .");
			
		}
		//fim do maior
		
		//começo do menor
		if(numero2>numero1 && numero3>numero1)
		{
			menor = numero1;
			//System.out.print("\nO número 1 é o maior");
			//System.out.print("\nN1: "+ numero1+ " ."); 
		}
		else if(numero1>numero2 && numero3>numero2) 
		{
			menor = numero2;
			//System.out.print("\nO número 2 é o maior");
			//System.out.print("\nN2: "+ numero2+ " ."); 
			
		}
		else if(numero1>numero3 && numero2>numero3)
		{
			menor = numero3;
			//System.out.print("\nO número 3 é o maior");
			//System.out.print("\nN3: "+ numero3+ " .");
			
		}
		//fim do menor
		
		//começo do médio
		
		if(maior==numero1 && menor==numero2)
		{
			medio=numero3; 
			//System.out.print("\nO número 1 é o maior");
			//System.out.print("\nN1: "+ numero1+ " ."); 
		}
		else if(maior==numero2 && menor==numero1)
		{
			medio=numero3; //ok
			//System.out.print("\nO número 1 é o maior");
			//System.out.print("\nN1: "+ numero1+ " ."); 
		}
		else if(maior==numero2 && menor==numero3) //fazer a condição inversa também
		{
			medio=numero1;
			//System.out.print("\nO número 2 é o maior");
			//System.out.print("\nN2: "+ numero2+ " ."); 
			
		}
		else if(maior==numero3 && menor==numero2) 
		{
			medio=numero1;//ok
			//System.out.print("\nO número 2 é o maior");
			//System.out.print("\nN2: "+ numero2+ " ."); 
			
		}
		else if(maior==numero1 && menor==numero3)//fazer a condição inversa também
		{
			medio = numero2;
			//System.out.print("\nO número 3 é o maior");
			//System.out.print("\nN3: "+ numero3+ " .");
			
		}
		else if(maior==numero3 && menor==numero1)
		{
			medio = numero2;//ok
			//System.out.print("\nO número 3 é o maior");
			//System.out.print("\nN3: "+ numero3+ " .");
			
		}
		//fim do medio
		
		System.out.print("\nA ordem crescente é: \n");
		
		System.out.print("\n");
		System.out.print(menor);
		System.out.print("\n");
		System.out.print(medio);
		System.out.print("\n");
		System.out.print(maior);
		
		System.out.print("\nObrigada e até à próxima!");
	}
}

