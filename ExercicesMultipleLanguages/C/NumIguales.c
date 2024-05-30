/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

#include<stdio.h>

int main() {
	int n1;
	int n2;
	int n3;
	printf("Ingresa 3 numeros: \n");
	scanf("%i",&n1);
	scanf("%i",&n2);
	scanf("%i",&n3);
	if (((n1+n2)==n3 || (n1+n3)==n2 || (n2+n3)==n1)) {
		printf("Iguales\n");
	} else {
		printf("Desiguales\n");
	}
	return 0;
}

