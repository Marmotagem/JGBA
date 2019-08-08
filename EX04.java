import java.util.Scanner;

public class EX04{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		float nota1 = entrada.nextFloat();
	
		System.out.print("Nota 2: ");
		float nota2 = entrada.nextFloat();
	
		System.out.print("Nota 3: ");
		float nota3 = entrada.nextFloat();
		
		System.out.print("Nota 4: ");
		float nota4 = entrada.nextFloat();
	
		System.out.println("Sua média é: " +(nota1+nota2+nota3+nota4)/4);
	
		entrada.close();
	
	}

}
