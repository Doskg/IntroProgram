// Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

function pruebas() {
	var nota = new Number();
	document.write("ingresa la nota : ",'<BR/>');
	nota = Number(prompt());
	if (nota<5) {
		document.write("Suspenso",'<BR/>');
	} else {
		if (nota<7) {
			document.write("Bien",'<BR/>');
		} else {
			if (nota<9) {
				document.write("Notable",'<BR/>');
			} else {
				document.write("Sobresaliente",'<BR/>');
			}
		}
	}
}

