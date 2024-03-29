package herencia2.Ej4;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//ALUMNO
		System.out.println("Inf alumno:");
		System.out.print("Curso: ");
		Scanner teclado = new Scanner(System.in);
		String curso = teclado.nextLine();
		System.out.print("N� asignaturas: ");
		int numAsig = teclado.nextInt();
		int[] asignaturas = new int [numAsig];
		for(int i = 0; i < numAsig; i++) {
			System.out.print("Nota asignatura "+(i+1)+" : ");
			asignaturas[i] = teclado.nextInt();
		}
		Persona alumno1 = new Alumno(curso, asignaturas, numAsig);
		System.out.println("Mayor nota: "+alumno1.DevolverMasAlto());
		
		//PROFES
		System.out.println("Inf profe:");
		System.out.println("Dep: ");
		String dep = teclado.nextLine();
		
		System.out.print("N� plus: ");
		int numPlus = teclado.nextInt();
		
		int[] plus = new int [numPlus];
		for(int i = 0; i < numPlus; i++) {
			System.out.print("Cant. plus "+(i+1)+" : ");
			plus[i] = teclado.nextInt();
		}
		Persona profe = new Profesor(dep, plus, numPlus);
		System.out.println("Mayor plus: "+profe.DevolverMasAlto());
		
		//DATOS:
		alumno1.VisualListaValores();
		profe.VisualListaValores();		
	}
}
