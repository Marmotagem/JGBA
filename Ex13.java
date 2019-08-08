import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos quilos de peixe João trouxe hoje?");
		float peso = entrada.nextFloat();
		
			float excesso = (peso - 50); 
			float multa = excesso * 4;
		
		 
		System.out.println("Excesso de peso: " +excesso);
		System.out.println("Valor da multa: R$ " +multa );
		
		entrada.close();
		
	}

}
