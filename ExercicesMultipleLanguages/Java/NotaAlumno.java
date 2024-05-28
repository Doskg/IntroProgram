/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRUEBAS.java."

import java.io.*;

public class pruebas {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int nota;
		System.out.println("ingresa la nota : ");
		nota = Integer.parseInt(bufEntrada.readLine());
		if (nota<5) {
			System.out.println("Suspenso");
		} else {
			if (nota<7) {
				System.out.println("Bien");
			} else {
				if (nota<9) {
					System.out.println("Notable");
				} else {
					System.out.println("Sobresaliente");
				}
			}
		}
	}


}

