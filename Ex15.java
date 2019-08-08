import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos metros quadrados serão pintados? "); 
		float m2 = entrada.nextInt();
		float litros = m2 / 3;
		float latas = (litros / 18);
		
		 latas = (float) Math.ceil(latas);
		
		 System.out.println("Serão usados: " +litros +"L");
		 System.out.println("Serão usadas " +latas +" latas, e serão gastos: R$ "+latas* 80);
		
		entrada.close();
		
	}

}
