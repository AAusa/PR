package ClasesObjetos2.Ej2;

import java.util.Scanner;

import ClasesObjetos2.Ej1.Disco;

public class Cincuenta {
	Empleado[] cincuenta = new Empleado[50];
	
	
	Disco [] cincuentaEmpleados() {
		int valorNombre = 0;
		String nombre = "";
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < 50; i ++) {
			valorNombre = (int) (Math.random()*5)+1;
			switch(valorNombre) {
			case 1:
				nombre = "Juan";break;
			case 2:
				nombre = "Mario";break;	
			case 3:
				nombre = "Jimeno";break;
			case 4:
				nombre = "Daniel";break;
			case 5:
				nombre = "Pepe";break;
			}
			Empleado empleado = new Empleado(nombre);
			cincuenta[i] = empleado;
		}
		return null;
	}
	
	Disco [] lecturaEmpleados() {
		for(int i = 0; i < 50; i ++) {
			System.out.println("Empleado: "+cincuenta[i].getNombre());
		}
	return null;
}
}
