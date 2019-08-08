import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual a temperatura em graus Farenheit? ");
		float frh = entrada.nextFloat();
		
		System.out.println("A temperatura é " +5 * (frh-32) / 9 +"°C");
	
		entrada.close();
		
	} 

}
