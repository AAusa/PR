/**
8) Dados m elementos de un conjunto que se desean agrupar de n en n, el n�mero de
combinaciones posibles es m!/(n!*(m-n)!), siendo siempre m >=n (hay que validarlo)
Escribir un m�todo para que, dados como par�metros m y n, nos calcule el n�mero
de combinaciones de m sobre n. Usad el m�todo factorial del ejercicio 3.
 */
package ClasesObjetos;
import java.util.Scanner;
public class Ej8 {
	// M�TODO C�LCULO COMBINACIONES DE FACTORIALES:
		static long Combinaciones (int m, int n) {
			long numeroCombinaciones = 0;
			numeroCombinaciones = (Factorial(m) / (Factorial(n) * Factorial(m-n)));
			
			return numeroCombinaciones;
		}
	
	//M�TODO C�LCULO FACTORIAL:
	static long Factorial(int numero) {
		int i = 1; 
		int factorial = 1;
		if (numero == 0) {
			System.out.println("Error");
		}
		else {
			for(i = 2; i <= numero; i++ ) {
				factorial = factorial*i;
			}
		}
		return factorial;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce m:");
		int m = teclado.nextInt();
		System.out.println("Introduce n (menor que m): ");
		int n = teclado.nextInt();
		long numCombinaciones;
		
		if (m < n) {
			System.out.println("Error, n tiene que ser menor que m");
		}
		else {
			numCombinaciones = Combinaciones (m, n);
			System.out.println("Numero de combinaciones: " + numCombinaciones);
		}
	}
}
