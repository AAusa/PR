package vector;

import java.util.Scanner;

public class Ej2 {
/**
 * 
 * @params vector1[], vector2[], vector3[], 

		int[] vector1 = new int[10];
		int[] vector2 = new int[10];
		int[] vector3 = new int[10];
		
		contador(i = 0; i < vector.length; i++)
			vector[i] = teclado.nextInt
			vector2[i] = teclado.nextInt
			vector3[i] = vector[i] + vector2[i]
			syso (vector3[i])
		fin contador

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector1 = new int[10];
		int[] vector2 = new int[10];
		int[] vector3 = new int[10];
		
		for (int i = 0; i < vector1.length; i++) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduce el componente "+i+" para el 1� vector:");
			vector1[i] = teclado.nextInt();
			System.out.println("Introduce el componente "+i+" para el 2� vector:");
			vector2[i] = teclado.nextInt();
			vector3[i] = vector1[i] + vector2[i];
			System.out.println("El componente "+i+" del 3� vector es: "+vector3[i]);
		}
	}
}
