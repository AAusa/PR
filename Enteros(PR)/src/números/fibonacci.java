/**
 * 
 */
package n�meros;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		
	
        int numero, num1 = 0, num2 = 1, suma = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero de digitos de la serie de Fibonacci: ");
		numero = teclado.nextInt();
		
        // Muestro el valor inicial
        System.out.println(num1);
         
        for (int i = 1; i < numero; i++) {
             
            // muestro la suma
            System.out.println(suma);
             
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
			
		}
	}

}

