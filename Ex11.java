import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a sua altura?");
		float altura = entrada.nextFloat();
		
		float pesoi = (float) ((72.7 * altura) - 58);
		
		System.out.println("Seu peso ideal é: " +pesoi);
		
		entrada.close();
	
	}

}
