package cadenas;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto;
		String palabra;
		int longitud;
		int resultado;
		String palabraE;
		
		System.out.println("Introduce una frase: ");
		Scanner teclado = new Scanner(System.in);	
		texto = teclado.nextLine();
		
		System.out.println("Introduce una palabra de la frase: ");
		palabra = teclado.nextLine();
		
		longitud = texto.length();
		palabraE = " "+palabra;
		resultado = texto.indexOf(palabraE);
		
		if (resultado==-1) {
			System.out.println("0");
		}
		else {
			resultado = resultado+1;
			System.out.println(resultado);
		}

	}

}
