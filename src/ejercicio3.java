import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float velocidad = 0.0f;
		float conversion = 0.0f;
		boolean error = false;
		String aux = "";

		do {
			error = false;
			System.out.print("Introduzca la velocidad: ");
			try {
				aux = teclado.nextLine();
				velocidad = Float.parseFloat(aux);
			} catch (Exception e) {
				System.out.println("Error, no has introducido un número");
				error = true;
			}
			if (!(velocidad >= 0)) {
				System.out.println("Error, has introducido un numero negativo");
				error = true;
			}
		} while (error);
		
		conversion= metros(velocidad);
		System.out.println("Los kilometro por horas convertido a metros por segundo son: "
		+ conversion + "m/s ");

	}
	public static float metros (float velocidad){
		float metros=0.0f;
		
		metros= (velocidad*1000)/3600;
		return metros;
	}

}
