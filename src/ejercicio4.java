import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double longitud_hipotenusa = 0.0;
		double longitud_cateto1 = 0.0;
		double longitud_cateto2 = 0.0;
		boolean error = false;
		String aux = "";

		do {
			error = false;
			System.out.print("Introduzca la longitud del primer cateto: ");
			try {
				aux = teclado.nextLine();
				longitud_cateto1 = Double.parseDouble(aux);
			} catch (Exception e) {
				System.out.println("Error, no has introducido un número");
				error = true;
			}
			if (!(longitud_cateto1 >= 0)) {
				System.out.println("Error, has introducido un numero negativo");
				error = true;
			}
		} while (error);
		
		do {
			error = false;
			System.out.print("Introduzca la longitud del segundo cateto: ");
			try {
				aux = teclado.nextLine();
				longitud_cateto2 = Float.parseFloat(aux);
			} catch (Exception e) {
				System.out.println("Error, no has introducido un número");
				error = true;
			}
			if (!(longitud_cateto2 >= 0)) {
				System.out.println("Error, has introducido un numero negativo");
				error = true;
			}
		} while (error);
		
		longitud_hipotenusa= longitud(longitud_cateto1,longitud_cateto2);
		System.out.println("La hipotenusa es: " +longitud_hipotenusa);
		
	}
	public static double longitud (double longitud_cateto1, double longitud_cateto2){
		double longitud=0.0f;
		longitud= Math.sqrt(Math.pow(longitud_cateto1,2) + Math.pow(longitud_cateto2,2));
		return longitud;
	}

}
