package herencia.Ej1;

import java.util.Scanner;

public class Cliente implements Persona {
	String nombre = "";
	String edad = "";
	String puesto = "";
	@Override
	public void pedirTodosDatos() {
		/*nombreEmpresa = "editorial";*/
		System.out.println("Nombre cliente:");
		Scanner teclado = new Scanner(System.in);
		nombre = "Nombre cliente: "+teclado.nextLine();
		System.out.println("Edad cliente:");
		edad = "Edad cliente: "+teclado.nextLine();
		System.out.println("Puesto cliente:");
		puesto = "Puesto cliente: "+teclado.nextLine();
	}

	@Override
	public void visualizarTodosDatos() {
		System.out.println(nombreEmpresa);
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(puesto);
	}

}
