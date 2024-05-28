/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "NUMENTERO.java."

import java.io.*;

public class numentero {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Ingresa un numero entero: ");
		n = Integer.parseInt(bufEntrada.readLine());
		if (n>0) {
			System.out.println("Numero es positivo y mayor a cero (0)");
		}
	}


}

