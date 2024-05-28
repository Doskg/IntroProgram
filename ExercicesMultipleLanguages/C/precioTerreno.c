/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

#include<stdio.h>

int main() {
	float ancho;
	float largo;
	float precio;
	float preciomts2;
	/* Entrada : Tres numeros reales */
	/* Salida : Un numero real precio del terreno */
	/* Proceso : Calcular usando la formula: precio = largo * ancho * precio del m^2 */
	printf("Ingresa el largo del terreno: \n");
	scanf("%f",&largo);
	printf("Ingresa el ancho del terreno: \n");
	scanf("%f",&ancho);
	printf("Ingresa el valor del metro^2: \n");
	scanf("%f",&preciomts2);
	precio = largo*ancho*preciomts2;
	printf("%f\n",precio);
	return 0;
}

