/**
 * 
 */
package vector;

/**
 * @author alu
 *
 */
public class Ej1 {

	/**
	 * @params vector[], int mayor, String mensajeMayor, String mensajeMenor
		int[] vector = new int[20];
		mayor = 0
		contador(i = 0; i < vector.length; i++)
			Math.random
			sumaTotal += vector[i]
			Si vector[i] > mayor 
				mayor = vector[i]
		fin contador
		
		contador(i = 0; i < vector.length; i++)
			Si vector[i] > sumaTotal
				mensajeMayor = "mayor de la media es "+vector[i]+", ";
			Si vector[i] > sumaTotal
				mensajeMenor = "menor de la media es "+vector[i]+", ";
		fin contador
	 */
	public static void main(String[] args) {
		
		int[] vector = new int[20];
		int mayor = 0, sumaTotal = 0, media = 0, cMayor = 0, cMenor = 0, cIgual = 0;
		String mensajeMayor = "", mensajeMenor = "";
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random()*20+1);
			sumaTotal += vector[i];
			if(vector[i] > mayor) {
				mayor = vector[i];
			}
		}
		
		media = sumaTotal / 20;
		
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] > media) {
				System.out.println("Mayor de la media es "+vector[i]);
				cMayor++;
			}
			else {
				if(vector[i] < media) {
					System.out.println("Menor de la media es "+vector[i]);
					cMenor++;
				}
				else {
					System.out.println("Igual a la media es "+vector[i]);
					cIgual++;
				}
			}
		}
		System.out.println("Media: "+media);
		System.out.println("Valor mayor: "+mayor);
		System.out.println("N� mayores de la media: "+cMayor);
		System.out.println("N� menores de la media: "+cMenor);
		System.out.println("N� menores de la media: "+cIgual);
	}
}
