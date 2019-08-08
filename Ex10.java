import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 Números");
		
		System.out.print("Digite 1 número inteiro: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Outro número inteiro: ");
		int num2 = entrada.nextInt();
		
		System.out.print("Agora 1 número real: ");
		float numreal = entrada.nextFloat();
		
		float a = (num1*2)+(num2/2);
		float b = (num1*3)+numreal;
		double c = Math.pow(numreal,3);
		
		System.out.println("O dobro do primeiro número com a metade do segundo número: " +a);
		System.out.println("A soma do triplo do primeiro número com o terceiro número: "+b);
		System.out.println("O terceiro elevado ao cubo: " +c);
	
		entrada.close();
	
	}

}
