package PacoteJava;
import java.util.*; //chamando toda a biblioteca
public class Matriz {

	
	public static void main(String[] args) {
		
		//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		
		Scanner ler = new Scanner(System.in);
		//System.out.println("\n OI \n");
		int matriz[][] = new int[3][3];
		
		int linha, coluna, maiordez;
		
		linha=0;
		coluna=0;
		maiordez=0;
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nDigite o número por favor: ");
				matriz[linha][coluna] = ler.nextInt();
				
				if(matriz[linha][coluna]>10)
				{
					maiordez=maiordez+1;
				}
			}
		}
		
		System.out.println("\n A matriz possui " +maiordez+ " valores maiores que 10. \n");
		
	}
}
