import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a sua altura?");
		float altura = entrada.nextFloat();
		
		float pesoh = (float) ((72.7 * altura) - 58);
		float pesom = (float) ((62.1 * altura) - 44.7);
	
		System.out.println("Se for homem seu peso ideal é: " +pesoh);
		System.out.println("Se for mulher seu peso ideal é: " +pesom);
		
		entrada.close();
	}

}
