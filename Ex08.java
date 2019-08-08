import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos reais você ganha por hora? ");
		float porh = entrada.nextFloat();
		
		System.out.print("Quantas horas você trabalha por mês? ");
		int hrs = entrada.nextInt();
		
		System.out.println("Seu salario esse mês foi de: R$ " +porh*hrs);
		
		entrada.close();	

	}

}
