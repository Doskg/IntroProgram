// Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

function precioterreno() {
	// Entrada : Tres numeros reales
	// Salida : Un numero real precio del terreno
	// Proceso : Calcular usando la formula: precio = largo * ancho * precio del m^2
	var largo = new Number();
	var ancho = new Number();
	var preciomts2 = new Number();
	var precio = new Number();
	document.write("Ingresa el largo del terreno: ",'<BR/>');
	largo = Number(prompt());
	document.write("Ingresa el ancho del terreno: ",'<BR/>');
	ancho = Number(prompt());
	document.write("Ingresa el valor del metro^2: ",'<BR/>');
	preciomts2 = Number(prompt());
	precio = largo*ancho*preciomts2;
	document.write(precio,'<BR/>');
}

