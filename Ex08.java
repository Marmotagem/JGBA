import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos reais voc� ganha por hora? ");
		float porh = entrada.nextFloat();
		
		System.out.print("Quantas horas voc� trabalha por m�s? ");
		int hrs = entrada.nextInt();
		
		System.out.println("Seu salario esse m�s foi de: R$ " +porh*hrs);
		
		entrada.close();	

	}

}
