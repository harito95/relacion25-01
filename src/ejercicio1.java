import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float gradoscentigrados = 0.0f;
		float resultado = 0.0f;
		String aux = "";
		boolean error = false;

		do {
			error = false;
			System.out.print("Introduzca lo grados centigrados: ");
			try {
				aux = teclado.nextLine();
				gradoscentigrados = Float.parseFloat(aux);
			} catch (Exception e) {
				error = true;
				System.out.println("Error, No has introducido un número");
			}
		} while (error);
		resultado = conversión(gradoscentigrados);
		System.out.print("Los grados fahrenheit convertidos de los grados centigrados son: " + resultado + "ºF");

	}

	public static float conversión(float gradoscentigrados) {
		float gradofahrenheit = 0.0f;
		gradofahrenheit = 32 + (9 * gradoscentigrados / 5);
		return gradofahrenheit;
	}

}
