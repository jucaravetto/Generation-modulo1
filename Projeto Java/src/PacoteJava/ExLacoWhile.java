package PacoteJava;
import java.util.*; //chamando toda a biblioteca

public class ExLacoWhile {
	public static void main(String[] args) {
		
		/*Solicitar a idade de v?rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		Scanner ler = new Scanner(System.in);
		
		int idade, peop21, peop50;
		//limpando vari?veis
		idade=0;
		peop21=0;
		peop50=0;
		
		System.out.print("\n(Se quiser encerrar o programa, digite idade igual a -99!)");
		System.out.print("\nOl?! Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade<0 || idade>100)
		{
			System.out.print("\nDigite uma idade v?lida: ");
			idade = ler.nextInt();
		}
		
		while(idade!=-99)
		{
			if(idade<21)
			{
				peop21=peop21+1;
				System.out.print("\nDigite mais uma idade: ");
				idade = ler.nextInt();
				
				if(idade<0 || idade>100)
				{
					if(idade==-99)
					{
						break;
					}
					System.out.print("\nDigite uma idade v?lida: ");
					idade = ler.nextInt();
				}
			}
			else if (idade>50)
			{
				peop50=peop50+1;
				System.out.print("\nDigite mais uma idade: ");
				idade = ler.nextInt();
				
				if(idade<0 || idade>100)
				{
					if(idade==-99)
					{
						break;
					}
					System.out.print("\nDigite uma idade v?lida: ");
					idade = ler.nextInt();
				}
			}
			else
			{
				System.out.print("\nDigite mais uma idade: ");
				idade = ler.nextInt();
				
				if(idade<0 || idade>100)
				{
					if(idade==-99)
					{
						break;
					}
					System.out.print("\nDigite uma idade v?lida: ");
					idade = ler.nextInt();
				}
			}

		}
		
		if(idade==-99) //ok
		{
			System.out.print("\nVoc? encerrou o programa.");
		}
		
		System.out.print("\nO n?mero de pessoas menores de 21 anos ?: "+peop21);
		System.out.print("\nO n?mero de pessoas maiores de 50 anos ?: "+peop50);
	}

}
