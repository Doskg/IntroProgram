/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "NUMMAYOR.java."

import java.io.*;

public class nummayor {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int n1;
		int n2;
		System.out.println("Ingrese dos numeros ");
		n1 = Integer.parseInt(bufEntrada.readLine());
		n2 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("El mayor de dos numero es : ");
		if (n1>n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}


}

