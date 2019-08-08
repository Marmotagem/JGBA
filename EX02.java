import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {

		
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe um número: ");
		int num1 = entrada.nextInt();
		
	System.out.print("O número informado foi: " +num1);

	entrada.close();
	
	}

}
