package entornos;

public class DebugPruebaCodigo {

	public static void main(String[] args) {
		char[] cadena = new char[10];
		char letra = 0;
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
		DebugPruebaCodigo prueba = new DebugPruebaCodigo();
	}
}
