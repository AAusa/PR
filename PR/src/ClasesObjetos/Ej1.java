package ClasesObjetos;

import java.util.Scanner;

public class Ej1 {
	static boolean esPrimo (int numero) {
		boolean primo = true;
		int contador=2;

		while ((primo==true) && (contador!=numero)){
			  if (numero % contador == 0) {
				  primo = false;
			  }  
			  contador++;
			}
		return primo;	
	}
	public static void main (String[]args) {
		int numero;
		boolean primo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		numero = teclado.nextInt();
				
		primo=esPrimo(numero);
		
		if(primo==true || numero == 2) {
			System.out.println("Es primo");
		}
		else {
			System.out.println("No es primo");
		}
		
		
	}
}
