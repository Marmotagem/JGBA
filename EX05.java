import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Conversão Metros para Centímetros ");
		System.out.print(" Quantos metros?  ");
        int metros = entrada.nextInt();
        
        	System.out.println(" " +metros+ "m são exatamente " +metros*100 +"cm.");
		
        	entrada.close();
        	
	}

}
