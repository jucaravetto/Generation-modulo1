package PacoteJava;
//import java.util.*; //chamando toda a biblioteca

public class ExLacoFor {
	public static void main(String[] args) {
		
		//Informar todos os n?meros de 1000 a 1999 que, quando divididos por 11, obtemos resto = 5. (FOR)
		
		//Scanner ler = new Scanner(System.in); //se quisesse ler
		
		int x, divisor;
		x=1000;
		divisor=0;
		System.out.print("\nOs n?meros: ");	
		
		for(x=1000;x<=1999;x++) //loop que roda de 1000 a 1999 e dentro verifica se o resto da divis?o por 11 ? 5:
		{
			if((x%11)==5)
			{
				divisor=x;
				System.out.print("\n"+divisor);	
			}
		}
		
		System.out.print("\nAtendem ?s condi??es.");	
	}
}
