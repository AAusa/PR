package ClasesObjetos2.Ej2;

/**
 * @author �lvaro
 *
 */
import java.util.Scanner;
public class EmpleadoMain {

	/**
	 * @param nombre, numEmpleado
	 */
	public static void main(String[] args) {
		// Se obtiene nombre y numEmpleado y se inserta en el atributo del objeto:
		/**
		System.out.println("Introduzca nombre:");
		Scanner teclado = new Scanner (System.in);
		String nombre = teclado.nextLine();	
		Empleado empleado1 = new Empleado(nombre);
		
		System.out.println("Introduzca numEmpleado:");
		int numEmpleado = teclado.nextInt();	

		empleado1.leerDatos(nombre,numEmpleado);
		
		//Se muestra el m�todo toString:
		System.out.println(empleado1.verDatos());
		**/
		Cincuenta grupoEmpleados1 = new Cincuenta();
		grupoEmpleados1.cincuentaEmpleados();
		grupoEmpleados1.lecturaEmpleados();
	}

}
