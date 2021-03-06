package herencia.Ej3y4;

import java.util.Scanner;

public class Empleado {
/**
 * RellenarDatos(e Empleado)
	si e = obj Jefe
		nombre = teclado
		edad = teclado
		incSueldo = 250
		sueldoBase = 1000
	sino
		nombre = teclado
		edad = teclado
		incSueldo = 0
		sueldoBase = 1000
 */
	static String nombreEmpresa = "Electrica S.L";
	private String nombre;
	private int edad;
	private int sueldoBase;

	public static String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public static void setNombreEmpresa(String nombreEmpresa) {
		Empleado.nombreEmpresa = nombreEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public void RellenarDatos() {
		System.out.println("Inf. empleado:");
		Scanner teclado = new Scanner(System.in);
		System.out.print("	Nombre: ");
		nombre = teclado.nextLine();
		System.out.print("	Edad: ");
		edad = teclado.nextInt();
		sueldoBase = 1000;
	}
	
	public void LeerDatos() {
		System.out.println();
		System.out.println("	Nombre empleado: "+nombre);
		System.out.println("	Edad empleado: "+edad);
		System.out.println("	sueldoBase empleado: "+sueldoBase);
	}

	public Empleado() {
		RellenarDatos();
	}
}