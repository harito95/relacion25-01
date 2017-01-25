import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area = 0.0;
		double longitud = 0.0;
		double radio = 0.0;
		boolean error = false;
		String aux = "";

		do {
			error = false;
			System.out.print("Introduzca el radio de la circunferencia: ");
			try {
				aux = teclado.nextLine();
				radio = Double.parseDouble(aux);
			} catch (Exception e) {
				System.out.println("Error, no has introducido un número");
				error = true;
			}
			if (!(radio >= 0)) {
				System.out.println("Error, has introducido un numero negativo");
				error = true;
			}
		} while (error);
		
		longitud=longitud1(radio);
		area=area1(radio);
		System.out.println("Radio de la circunferencia: "+area);
		System.out.print("Longitud de la circunferencia: "+longitud);

	}

	public static double longitud1(double radio) {
		double numero = 0.0;
		numero = 2 * Math.PI * radio;
		return numero;

	}

	public static double area1(double radio) {
		double numero = 0.0;
		numero = Math.PI * (radio * radio);
		return numero;

	}
}
