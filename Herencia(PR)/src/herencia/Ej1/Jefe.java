package herencia.Ej1;

import java.util.Scanner;

public class Jefe extends Empleado {
	String titulo = "";
	String dep = "";
	public Jefe() {
		super();
		PedirDatosJefe();	
	}
	private void PedirDatosJefe() {
		System.out.println("Datos jefe:");
		System.out.print("	T�tulo: ");
		Scanner teclado = new Scanner(System.in);
		titulo = teclado.nextLine();
		System.out.print("	Departamento: ");
		dep = teclado.nextLine();
	}
	public void verDatosJefe() {
		System.out.println("Resumen jefe:");
		verDatos();
		System.out.print("	Titulo: "+titulo);
		System.out.print("	Dep: "+dep);
		System.out.println();
	}
}

