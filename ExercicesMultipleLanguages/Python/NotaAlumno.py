# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	nota = int()
	print("ingresa la nota : ")
	nota = int(input())
	if nota<5:
		print("Suspenso")
	else:
		if nota<7:
			print("Bien")
		else:
			if nota<9:
				print("Notable")
			else:
				print("Sobresaliente")

