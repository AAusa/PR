package vector;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
/**
 * 
 * @param args
 * int[] vector = new int[10];
	contador(i = 0; i < vector.length; i++)
		vector[i] = teclado.nextInt
	fin contador
	
	Arrays.sort(vector);
	syso(Mayor: vector[1])
	syso(Menor: vector[10])
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector = new int[10];
		
		for (int i = 0; i < vector.length; i++) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduce el componente "+i+" para el vector:");
			vector[i] = teclado.nextInt();
		}
		Arrays.sort(vector);
		System.out.println("Menor: "+vector[0]);
		System.out.println("Mayor: "+vector[9]);
	}
}
