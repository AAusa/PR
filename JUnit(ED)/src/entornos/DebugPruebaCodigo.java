package entornos;

public class DebugPruebaCodigo {
	char cadena[] = new char[10];
	int contar_letra(char cadena[], char letra) {	
		int contador, n, longitud;
		n = 0;
		contador = 0;
		longitud = cadena.length;
		if (longitud > 0) {
			do {
				if (cadena[contador] == letra) {
					n++;
				}
				contador++;
				longitud--;
			} while (longitud > 0);
		}
		return n;
	}
}
