package ClasesObjetos2.Ej1;

import java.util.Scanner;

/**
 * @author �lvaro
 *
 */
public class DiscoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		Disco disco1 = new Disco ("sol", 4, 10, "11/01/2022");
		System.out.println(disco1.getTitulo()+" "+disco1.getnCanciones()+" "+disco1.getPrecio()+" "+disco1.getFechaCompra()+".");
		disco1.setTitulo("luna");
		System.out.println(disco1.getTitulo());
		**/
		Scanner teclado = new Scanner(System.in);
		System.out.println("�Cu�ntos discos desea introducir en la colecci�n?");
		int indice = teclado.nextInt();
		Coleccion coleccion1 = new Coleccion ();
		coleccion1.nuevoDisco(indice);
		coleccion1.lecturaDiscos(indice);
	}

}
