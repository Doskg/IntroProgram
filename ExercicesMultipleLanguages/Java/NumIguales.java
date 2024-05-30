/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "NUMIGUALES.java."

import java.io.*;

public class numiguales {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int n1;
		int n2;
		int n3;
		System.out.println("Ingresa 3 numeros: ");
		n1 = Integer.parseInt(bufEntrada.readLine());
		n2 = Integer.parseInt(bufEntrada.readLine());
		n3 = Integer.parseInt(bufEntrada.readLine());
		if (((n1+n2)==n3 || (n1+n3)==n2 || (n2+n3)==n1)) {
			System.out.println("Iguales");
		} else {
			System.out.println("Desiguales");
		}
	}


}

