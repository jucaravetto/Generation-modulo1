package PacoteJava;
import java.util.*; //chamando toda a biblioteca

public class ExLacoDoooWhile {
	public static void main(String[] args) {
		
		/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		  No final, mostre a soma dos números digitados.(DO...WHILE)*/
		
		Scanner ler = new Scanner(System.in); //se quiser ler
		
		int numero, soma;
		//limpando variáveis
		numero=0;
		soma=0;
		
		System.out.print("\nOlá! Digite um número: ");
		numero = ler.nextInt();
		
		if(numero==0)
		{
			System.out.print("\nDigite um número diferente de 0: ");
			numero = ler.nextInt();
		}
		
		do
		{
			soma= soma + numero;
			System.out.print("\nDigite mais um número: ");
			numero = ler.nextInt();
			
			
		}while(numero!=0);
		
		System.out.print("\nA soma dos números é: " +soma);
		
	}
	
}

