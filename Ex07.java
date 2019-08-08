import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto mede um lado do quadrado? (centímetros)");
		float areaq = entrada.nextFloat();
		
		System.out.println("A area do quadrado mede: " +(areaq*areaq)+" cm²");
		
		entrada.close();
		
	}

}
