package Ej1;

public class Pila {
	final int MAXSIZE = 100;
	int [] datos;
	int size;
	int cantidadElementos = 0;
	public Pila () {
		datos = new int[MAXSIZE];
	}
	
	void push (int valor) throws PilaDesbordeException {
		if(MAXSIZE <= cantidadElementos) {
			throw new PilaDesbordeException("No pueden entrar m�s elementos");
		}
		else {
			datos [cantidadElementos ++] = valor;
		}	
	}
	
	public int pop () throws PilaVaciaException {
		if(cantidadElementos == 0) {
			throw new PilaVaciaException("Pila vacia");
		}
		else {
			return datos[cantidadElementos--];
		}			
	}
	
	public int size() {
		return cantidadElementos;
	}
	
	public void verElementos() throws PilaVaciaException {
		for(int i = cantidadElementos-1; i >= 0; i--) {
			if(cantidadElementos == 0) {
				throw new PilaVaciaException("Pila vacia");
			}
			else {
				System.out.println("Posici�n "+i+", contenido: "+datos[cantidadElementos--]);
			}
		}
	}
}
