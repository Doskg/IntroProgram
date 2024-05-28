/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRECIOTERRENO.java."

import java.io.*;

public class precioterreno {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double ancho;
		double largo;
		double precio;
		double preciomts2;
		// Entrada : Tres numeros reales
		// Salida : Un numero real precio del terreno
		// Proceso : Calcular usando la formula: precio = largo * ancho * precio del m^2
		System.out.println("Ingresa el largo del terreno: ");
		largo = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresa el ancho del terreno: ");
		ancho = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresa el valor del metro^2: ");
		preciomts2 = Double.parseDouble(bufEntrada.readLine());
		precio = largo*ancho*preciomts2;
		System.out.println(precio);
	}


}

