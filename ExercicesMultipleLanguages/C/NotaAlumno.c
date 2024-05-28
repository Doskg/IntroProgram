/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

#include<stdio.h>

int main() {
	int nota;
	printf("ingresa la nota : \n");
	scanf("%i",&nota);
	if (nota<5) {
		printf("Suspenso\n");
	} else {
		if (nota<7) {
			printf("Bien\n");
		} else {
			if (nota<9) {
				printf("Notable\n");
			} else {
				printf("Sobresaliente\n");
			}
		}
	}
	return 0;
}

