/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

#include<stdio.h>

int main() {
	int n1;
	int n2;
	printf("Ingrese dos numeros \n");
	scanf("%i",&n1);
	scanf("%i",&n2);
	printf("El mayor de dos numero es : \n");
	if (n1>n2) {
		printf("%i\n",n1);
	} else {
		printf("%i\n",n2);
	}
	return 0;
}

