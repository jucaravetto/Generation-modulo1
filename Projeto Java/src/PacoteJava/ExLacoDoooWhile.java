package PacoteJava;
import java.util.*; //chamando toda a biblioteca

public class ExLacoDoooWhile {
	public static void main(String[] args) {
		
		/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		  No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
		
		Scanner ler = new Scanner(System.in); //se quiser ler
		
		int numero, soma;
		//limpando vari�veis
		numero=0;
		soma=0;
		
		System.out.print("\nOl�! Digite um n�mero: ");
		numero = ler.nextInt();
		
		if(numero==0)
		{
			System.out.print("\nDigite um n�mero diferente de 0: ");
			numero = ler.nextInt();
		}
		
		do
		{
			soma= soma + numero;
			System.out.print("\nDigite mais um n�mero: ");
			numero = ler.nextInt();
			
			
		}while(numero!=0);
		
		System.out.print("\nA soma dos n�meros �: " +soma);
		
	}
	
}

