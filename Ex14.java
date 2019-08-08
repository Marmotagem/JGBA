import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos reais você ganha por hora? ");
		float porh = entrada.nextFloat();
		
		System.out.print("Quantas horas você trabalha por mês? ");
		int hrs = entrada.nextInt();
		
		float sb = porh*hrs;
		float inss = (float) (sb * 0.05);
		float sind = (float) (sb * 0.08);
		float ir = (float) (sb * 0.11);
		
		System.out.println("Seu salario bruto esse mês foi de: R$ " +sb);
		
		System.out.println("Pagou ao INSS: " +inss);
		
		System.out.println("Pagou ao Sindicato: " +sind);
		
		float salarl = sb - (inss + sind + ir)  ;
		System.out.println("Salario liquido: " +salarl);
		
		entrada.close();
				
	}

}