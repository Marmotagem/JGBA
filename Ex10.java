import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 N�meros");
		
		System.out.print("Digite 1 n�mero inteiro: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Outro n�mero inteiro: ");
		int num2 = entrada.nextInt();
		
		System.out.print("Agora 1 n�mero real: ");
		float numreal = entrada.nextFloat();
		
		float a = (num1*2)+(num2/2);
		float b = (num1*3)+numreal;
		double c = Math.pow(numreal,3);
		
		System.out.println("O dobro do primeiro n�mero com a metade do segundo n�mero: " +a);
		System.out.println("A soma do triplo do primeiro n�mero com o terceiro n�mero: "+b);
		System.out.println("O terceiro elevado ao cubo: " +c);
	
		entrada.close();
	
	}

}
