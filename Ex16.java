import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos metros quadrados ser�o pintados? "); 
		float m2 = entrada.nextInt();
		float litros = m2 / 6;
		float latas = (litros / 18);
		float latas2 = (float) (litros / 3.6);
		
		 latas = (float) Math.ceil(latas);
		 latas2 = (float) Math.ceil(latas2);
		 
		 System.out.println("Ser�o usados: " +litros +"L");
		 System.out.println("Ser�o usadas " +latas +" latas de 18 litros, e ser�o gastos: R$ "+latas * 80);
		 System.out.println("Ser�o usadas " +latas2 +" gal�es de 3,6 litros, e ser�o gastos: R$ "+latas2 * 25);
		 
		 entrada.close();
	}

}
