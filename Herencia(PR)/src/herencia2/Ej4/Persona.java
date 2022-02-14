package herencia2.Ej4;

import java.util.Scanner;

public abstract class Persona {
	
	public Persona() {
	}
	
	String nombre;
	int edad;
	final void pedirDatosPersona() {
		System.out.println("Inf com�n:");
		System.out.print("Nombre: ");
		Scanner teclado = new Scanner(System.in);
		nombre = teclado.nextLine();
		System.out.print("Edad: ");
		edad = teclado.nextInt();
	}
	final void verDatosPersona() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}
	
	abstract int DevolverMasAlto();
	abstract void VisualListaValores();
}
