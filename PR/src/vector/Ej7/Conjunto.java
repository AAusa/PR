package vector.Ej7;
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
	public void agregar(int num) {
		boolean noRellenado = false;
		for(int i = 0; i < 100 && noRellenado == false; i++) {
			if(coleccion [i] == 0) {
				coleccion [i] = num;
				noRellenado = true;
			}
		}
	}
	/**
	Eliminar(elemento):
		contador (i = 1; i <= elemento; i++)
			Si i == elemento
				coleccion [i] = 0
	**/
	public void eliminar(int elemento) {
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
	public void copiar(int eCopiado, int eAcopiar) {
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
	public boolean esMiembro(int elemento) {
		boolean aparece = false;
		int contenido = 0;
		for(int i = 0; i < 100; i++) {
			if(coleccion [i] == elemento) {
				aparece = true;
			}
			else {
				aparece = false;
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
	
	public int posicion(int elemento) {
		boolean noElemento = false;
		int posicion = 0;
		for(int i = 0; i < 100 && noElemento == false; i++) {
			if(coleccion [i] == elemento) {
				posicion = i;
				noElemento = true;
			}
		}
		if(noElemento == true) {
			posicion = -1;
		}
		return posicion;
	}
	/**
	 *  private CreaArray2
			Crea coleccion2
		contador (i = 0; i < 100; i++)
			int relleno = teclado
			relleno = coleccion [i]
	 */
	
}
