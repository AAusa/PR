package herencia.Ej2;

import java.util.Scanner;

public class Empleados {
	String nombre = "";
	int sueldo = 0;
	int edad = 0;
	public Empleados() {
		pedirTodosDatos();
	}
	
	private void pedirTodosDatos() {
		System.out.println("Nombre empleado:");
		Scanner teclado = new Scanner(System.in);
		nombre = "Nombre empleado: "+teclado.nextLine();
		System.out.println("Sueldo empleado:");
		sueldo = teclado.nextInt();
		System.out.println("Edad empleado:");
		edad = teclado.nextInt();
	}

	public void visualizarTodosDatos() {
		System.out.println("Inf. empleado:");
		System.out.println("Nombre empleado: "+nombre);
		System.out.println("Edad empleado: "+edad);
		System.out.println("Sueldo empleado: "+sueldo);
		System.out.println();
	}
	
}
