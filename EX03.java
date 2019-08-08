
import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe um número: ");
		int num1 = entrada.nextInt();

	System.out.print("Informe um número: ");
		int num2 = entrada.nextInt();
	
		System.out.println("A Soma dos números informados é: "+(num1+num2));
	
		entrada.close();
	}

}
