package ClasesObjetos2.Ej1;

import java.util.Scanner;


public class Coleccion {
	Disco[] discos = new Disco[100];

	private int indice;	
	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	Disco [] nuevoDisco(int indice) {
		String titulo = "";
		String fechaCompra = "";
		int nCanciones = 0;
		int precio = 0;
		System.out.println("T�tulo:");
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < indice; i ++) {
			titulo = teclado.nextLine();
			System.out.println("Numero de canciones: ");
			nCanciones = teclado.nextInt();
			System.out.println("Precio: ");
			precio = teclado.nextInt();
			System.out.println("Fecha: ");
			fechaCompra = teclado.nextLine();
			Disco disco = new Disco(titulo,nCanciones,precio,fechaCompra);
			discos[i] = disco;
		}
		return discos;
	}
	
		Disco [] lecturaDiscos(int indice) {
			for(int i = 0; i < indice; i ++) {
				System.out.print("Disco n�: "+discos[i].getNumeroDiscos());
				System.out.println();
				System.out.print("Numero de canciones: "+discos[i].getnCanciones());
				System.out.print(" Fecha compra: "+discos[i].getFechaCompra());
				System.out.print(" Precio: "+discos[i].getPrecio());
				System.out.println(" Titulo: "+discos[i].getTitulo());
			}
		return discos;
	}
}

