package PacoteJava;
	import java.util.Scanner;


public class classeexercicioum {

	
	public static void main(String[] args) {
		
		//System.out.print("\nHello, world!");
		//System.out.print("\nIt's my first Java code!");
		
		/*In�cio do exerc�cio-programa 1 proposto
		Exerc�cio escolhido:
		1 - Fa�a um sistema que leia a idade de uma
		pessoa expressa em anos, meses e dias e mostre-a
		expressa apenas em dias.
		*/
		
		Scanner leia = new Scanner(System.in);
				
		int idadedias, anos, meses, dias, anosemdias, mesesemdias;
		System.out.print("\nOl� usu�rio! Vamos calcular sua idade em dias!");
		System.out.print("\nDigite, por favor, quantos anos voce tem: ");
		
		//System.out.println("\nEntre com a primeira nota: ");
		anos = leia.nextInt();
		System.out.print("\nVoc� tem: "+ anos+ " anos.");
		
		
		
	}
	
}
