import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos metros quadrados ser�o pintados? "); 
		float m2 = entrada.nextInt();
		float litros = m2 / 3;
		float latas = (litros / 18);
		
		 latas = (float) Math.ceil(latas);
		
		 System.out.println("Ser�o usados: " +litros +"L");
		 System.out.println("Ser�o usadas " +latas +" latas, e ser�o gastos: R$ "+latas* 80);
		
		entrada.close();
		
	}

}
