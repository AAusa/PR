package ClasesObjetos2.Ej3;

/**
 * @author �lvaro
 *
 */
public class TrabajadorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Trabajador trabajador1 = new Trabajador ("�lvaro", 'S', 'D', 2, 2);
		trabajador1.nomina('S', 'D', 2, 2);
		
		Trabajador trabajador2 = new Trabajador ("Marina", 'S', 'N', 1, 15);
		trabajador2.nomina('C', 'N', 1, 5);
		System.out.println(trabajador1.verDatos());
		System.out.println(trabajador2.verDatos());
	}
}
