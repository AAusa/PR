package vector.Ej11;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	int [][] matriz;
	private int filas;
	private int columnas;
	
	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	public void nFila_nColumna() {
		System.out.println("Filas: "+matriz[filas].length);
		System.out.println("Columnas: "+matriz[columnas].length);
	}
	public void AsignarValorCelda(int valor) {
		matriz[filas][columnas] = valor;
		System.out.println("EL valor introducido es: "+matriz[filas][columnas]);
	}
	public void leerCelda() {
		System.out.println("El valor de la direccion es: "+matriz[filas][columnas]);
	}
	public int[][] sumaMatrices(Matriz matriz1) {
		int[][]resultado = new int[2][2];
		for ( int fila = 0; fila < filas; fila ++ ) {
			for ( int columna = 0; columna < columnas; columna++) {
				resultado[fila][columna] = matriz[fila][columna] + matriz1.matriz[fila][columna];
			}
		}
		return resultado;	
	}
	public int[][] restaMatrices(Matriz matriz1) {
		int[][]resultado = new int[2][2];
		for ( int fila = 0; fila < filas; fila ++ ) {
			for ( int columna = 0; columna < columnas; columna++) {
				resultado[fila][columna] = matriz[fila][columna] - matriz1.matriz[fila][columna];
			}
		}
		return resultado;	
	}
	public int[][] multiMatrices(Matriz matriz1) {
		int[][]resultado = new int[2][2];
		for ( int fila = 0; fila < filas; fila ++ ) {
			for ( int columna = 0; columna < columnas; columna++) {
				resultado[fila][columna] = matriz[fila][columna] * matriz1.matriz[fila][columna];
			}
		}
		return resultado;	
	}
	public Matriz(int filas, int columnas) {
		this.matriz = new int [filas][columnas];
	}

	public static void main(String[] args) {
		Matriz matriz1 = new Matriz(2, 3);
		Matriz matriz2 = new Matriz(2, 3);
		matriz1.restaMatrices(matriz1);
		/**
		System.out.println("Fila:");
		int filas = teclado.nextInt();
		System.out.println("Columna:");
		int columnas = teclado.nextInt();
		System.out.println("Valor:");
		int valor = teclado.nextInt();
		matriz1.nFila_nColumna(filas, columnas);
		matriz1.AsignarValorCelda(filas, columnas, valor);
		matriz1.leerCelda(filas, columnas);
		matriz1.instanciar(filasCrea, columnasCrea);
		matriz1.sumaMatrices(filasCrea, columnasCrea);
		matriz1.restaMatrices(filasCrea, columnasCrea);
		matriz1.multiplicaMatrices(filasCrea, columnasCrea);
		System.out.println("Filas crear:");
		Scanner teclado = new Scanner(System.in);
		int filasCrea = teclado.nextInt();
		System.out.println("Columnas crear:");
		int columnasCrea = teclado.nextInt();
		**/
	}
}
