package prueba;

import java.util.Scanner;

public class EjCol {
	Scanner tec = new Scanner(System.in);
	private int indice=0;
	Disco [] coleccion = new Disco[100];
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	} 

	public void InDisco() {
		System.out.println("Titulo: ");
		String titulo = tec.nextLine();
		System.out.println("Numero de canciones: ");
		int ncan = tec.nextInt();
		System.out.println("Precio: ");
		int precio = tec.nextInt();
		System.out.println("Fecha: ");
		String fecha = tec.nextLine();
		Disco dc = new Disco(titulo,ncan,precio,fecha);
		coleccion[indice]=dc;
	}
	public void BusDisco(int ind) {
		
		
	}
}