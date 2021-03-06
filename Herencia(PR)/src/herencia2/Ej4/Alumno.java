package herencia2.Ej4;

import java.util.Scanner;

public class Alumno extends Persona {
	Scanner teclado = new Scanner(System.in);
	int numAsig;
	String curso;
	//como se pasa un vector entre clases
	public Alumno(String curso, int [] asignaturas, int numAsig) {
		super();
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.numAsig = numAsig;
		pedirDatosPersona();
	}
	int[] asignaturas = new int [numAsig];
	
	@Override
	int DevolverMasAlto() {
		int mayorNota = 0;
		for(int i = 0; i < asignaturas.length; i ++) {
			if(asignaturas[i] > mayorNota) {
				mayorNota = asignaturas[i]; 
			}
		}
		return mayorNota;
	}
	
	@Override
	void VisualListaValores() {
		verDatosPersona();
		System.out.println("Curso: "+curso);
		System.out.println("numAsig: "+numAsig);
		for(int i = 0; i < numAsig; i++) {
			System.out.print("Nota asignatura "+(i+1)+" : "+asignaturas[i]+". ");	
		}	
		System.out.println("Mayor nota: "+DevolverMasAlto());
	}
}

