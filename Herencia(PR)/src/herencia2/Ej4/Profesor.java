package herencia2.Ej4;

import java.util.Scanner;

public class Profesor extends Persona {
	Scanner teclado = new Scanner(System.in);
	int numPlus;
	String dep;
	//como se pasa un vector entre clases
	public Profesor(String dep, int [] plus, int numPlus) {
		super();
		this.dep = dep;
		this.plus = plus;
		this.numPlus = numPlus;
		pedirDatosPersona();
		
	}
	int[] plus = new int [numPlus];
	
	@Override
	int DevolverMasAlto() {
		int mayorPlus = 0;
		for(int i = 0; i < plus.length; i ++) {
			if(plus[i] > mayorPlus) {
				mayorPlus = plus[i]; 
			}
		}
		return mayorPlus;
	}
	
	@Override
	void VisualListaValores() {
		verDatosPersona();
		System.out.println("Dep: "+dep);
		System.out.println("numPlus: "+numPlus);
		for(int i = 0; i < numPlus; i++) {
			System.out.print("Cant. plus "+(i+1)+" : "+plus[i]+". ");	
		}	
		System.out.println("Mayor plus: "+DevolverMasAlto());
	}
}
