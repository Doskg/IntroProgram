# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Entrada : Tres numeros reales
	# Salida : Un numero real precio del terreno
	# Proceso : Calcular usando la formula: precio = largo * ancho * precio del m^2
	largo = float()
	ancho = float()
	preciomts2 = float()
	precio = float()
	print("Ingresa el largo del terreno: ")
	largo = float(input())
	print("Ingresa el ancho del terreno: ")
	ancho = float(input())
	print("Ingresa el valor del metro^2: ")
	preciomts2 = float(input())
	precio = largo*ancho*preciomts2
	print(precio)

