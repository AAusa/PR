package vector.Ej7;

import java.util.Scanner;

/**
 * 
 * @author alu
 *M�todos:
Vaciar:
contador (i = 0; i < 100; i++)
	coleccion [i] = 0

Agregar(num):
contador (i = 0; i < 100; i++)
	Si coleccion [i] == 0 
		coleccion [i] = num

Eliminar(elemento):
contador (i = 1; i <= elemento; i++)
	Si i == elemento
		coleccion [i] = 0

Copiar(eCopiado, eAcopiar):
contador (i = 1; i <= eCopiado;i++)
	Si i == eCopiado
		coleccion [i] = contenido

contador (i = 1; i <= eAcopiar;i++)
	Si i == aCopiar
		coleccion [i] = contenido

boolean esMiembro(elemento):
contador (i = 1; i <= 100; i++)
	Si coleccion [i] = elemento
		aparece = true
	Sino
		aparece = false
return aparece

int Posicion(elemento):
contador (i = 1; i <= 100; i++)
	Si coleccion [i] = elemento
		posicion = i
	Sino
		posicion = -1
return posicion

private CreaArray2
	Crea coleccion2
contador (i = 0; i < 100; i++)
	int relleno = teclado
relleno = coleccion [i]


public boolean sonIguales()
	creaArray2()
	contador (i = 0; i < 100; i++)
	Si coleccion [i] != coleccion2 [i]
		noIguales =false

return resultado

public Imprimir
contador (i = 0; i < 100; i++)
		syso(coleccion [i])
			
 */
public class Conjunto {
	int[] coleccion = new int[100];
	int [] coleccion2 = new int [100];
	Scanner teclado = new Scanner(System.in);
	
	private void rellenaArray() {
		boolean noElemento = false;
		int posicion = 0;
		for(int i = 0; i < 100; i++) {
			int num = (int) (Math.random()*100+1);
			for(int j = 0; j < 100 && noElemento == false; j++) {
				if(coleccion[j] == num) {
					noElemento = true;
					i = i - 1;
				}
			}
			if(noElemento == false) {
				coleccion[i] = num;
			}
			noElemento = false;
		}
		
	}
	
	public void vaciar() {
		for(int i = 0; i < 100; i++) {
			coleccion [i] = 0;
		}
	}
	/**
	 *  Agregar(num):
		contador (i = 0; i < 100; i++)
			Si coleccion [i] == 0 
				coleccion [i] = num
	 */
	public void agregar() {
		System.out.println("Escribe el n� a agregar:");
		int num = teclado.nextInt();
		boolean noRellenado = false;
		for(int i = 0; i < 100 && noRellenado == false; i++) {
			if(coleccion [i] == 0) {
				coleccion [i] = num;
				noRellenado = true;
				System.out.println("Has introducido "+num+" en el indice del vector "+coleccion [i]);
			}
		}
		
	}
	/**
	Eliminar(elemento):
		contador (i = 1; i <= elemento; i++)
			Si i == elemento
				coleccion [i] = 0
	**/
	public void eliminar() {
		System.out.println("Escribe el elemento a eliminar:");
		int elemento = teclado.nextInt();
		boolean noBorrado = false;
		for(int i = 0; i < 100 && noBorrado == false; i++) {
			if(i == elemento) {
				coleccion [i] = 0;
				noBorrado = false;
			}
		}
	}
	/**
	 * Copiar(eCopiado, eAcopiar):
		contador (i = 1; i <= eCopiado;i++)
			Si i == eCopiado
				coleccion [i] = contenido

		contador (i = 1; i <= eAcopiar;i++)
			Si i == aCopiar
				coleccion [i] = contenido
	 */
	public void copiar() {
		System.out.println("Escribe el elemento del que quieres copiar el valor interior:");
		int eCopiado = teclado.nextInt();
		System.out.println("Escribe el elemento del que quieres pegar el valor introducido:");
		int eAcopiar = teclado.nextInt();
		boolean noElemento = false;
		int contenido = 0;
		for(int i = 0; i < 100 && noElemento == false; i++) {
			if(i == eCopiado) {
				coleccion [i] = contenido;
				noElemento = true;
			}
		}
		noElemento = false;
		for(int i = 0; i < 100 && noElemento == false; i++) {
			if(i == eAcopiar) {
				coleccion [i] = contenido;
				noElemento = true;
			}
		}
	}
	/**
	 *  boolean esMiembro(elemento):
		contador (i = 0; i < 100; i++)
			Si coleccion [i] = elemento
				aparece = true
			Sino
				aparece = false
		return aparece
	 */
	public boolean esMiembro() {
		System.out.println("Escribe el numero que quieres comprobar si es miembro:");
		int num = teclado.nextInt();
		boolean aparece = false;
		int contenido = 0;
		for(int i = 0; i < 100; i++) {
			if(coleccion [i] == num) {
				aparece = true;
			}
		}
		return aparece;
	}
	/**
	 *  int Posicion(elemento):
		contador (i = 1; i <= 100; i++)
			Si coleccion [i] = elemento
				posicion = i
			Sino
//				posicion = -1
		return posicion
	 */
	
	public String posicion() {
		System.out.println("Escribe el n� del que quieres saber la posicion:");
		int num = teclado.nextInt();
		boolean noElemento = false;
		int posicion = 0;
		for(int i = 0; i < 100 && noElemento == false; i++) {
			if(coleccion [i] == num) {
				posicion = i;
				noElemento = true;
			}
		}
		if(noElemento == false) {
			posicion = -1;
		}
		return "La posicion es: "+posicion;
	}
	/**
	 *  private CreaArray2
			Crea coleccion2
		contador (i = 0; i < 100; i++)
			int relleno = teclado
			relleno = coleccion [i]
	 */
	private void CreaArray() {
		int relleno = 0;
		for(int i = 0; i < 100; i++) {
			System.out.println("Rellena valor:");
			relleno = teclado.nextInt();
			relleno = coleccion [i];
		}
	}
	/**
	 *  public boolean sonIguales()
		creaArray2()
		contador (i = 0; i < 100; i++)
		Si coleccion [i] != coleccion2 [i]
			noIguales =false
	return resultado
	 */
	
	public boolean sonIguales() {
		CreaArray();
		return coleccion.equals(coleccion2);
	}
	/**
	 * public Imprimir
		contador (i = 0; i < 100; i++)
			syso(coleccion [i])
	 */
	public void imprimir() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Valor: "+coleccion [i]);
		}
	}
	
	public static void main (String[]args) {
		Conjunto conjunto1 = new Conjunto();
		conjunto1.rellenaArray();
		conjunto1.imprimir();
	
		/**
		conjunto1.agregar();
		conjunto1.copiar();
		conjunto1.eliminar();
		System.out.println(conjunto1.esMiembro());
		System.out.println(conjunto1.posicion());
		conjunto1.imprimir();
		System.out.println(conjunto1.sonIguales());
		conjunto1.vaciar();
		**/
	}
}


