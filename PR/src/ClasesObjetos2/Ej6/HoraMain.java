/**
 * 
 */
package ClasesObjetos2.Ej6;

import java.util.Scanner;

/**
 * @author �lvaro
 *
 */

public class HoraMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hora hora1 = new Hora();
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce una hora en formato hh:mm:ss");
		int hora = teclado.nextInt();
		System.out.print(":");
		int min = teclado.nextInt();
		System.out.print(":");
		int seg = teclado.nextInt();
		
		System.out.println("Pulsa 1 para incrementar");
		System.out.println("Pulsa 2 para decrementar");
		int opcion = teclado.nextInt();
		int horaCambio = 0;
		int minCambio = 0;
		int segCambio = 0;
		switch(opcion) {
		case 1:
			System.out.println("�Cu�nto tiempo desea incrementar?");
			System.out.println("Introduce una hora en formato hh:mm:ss");
			horaCambio = teclado.nextInt();
			System.out.print(":");
			minCambio = teclado.nextInt();
			System.out.print(":");
			segCambio = teclado.nextInt();
			System.out.println(hora1.incremento(hora, min, seg, horaCambio, minCambio, segCambio));break;
		case 2:
			System.out.println("�Cu�nto tiempo desea decrementar?");
			System.out.println("Introduce una hora en formato hh:mm:ss");
			horaCambio = teclado.nextInt();
			System.out.print(":");
			minCambio = teclado.nextInt();
			System.out.print(":");
			segCambio = teclado.nextInt();
			System.out.println(hora1.decremento(hora, min, seg, horaCambio, minCambio, segCambio));break;
		default:
			System.out.println("Opci�n incorrecta");
		}		
	}
}
