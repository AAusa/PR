package vector.Ej10;

import java.util.Scanner;

/**
 * 
 * @author alu Matriz 3x3
 * 
 *         Matriz 3x3

Metodo:
Instancia con espacios
mientras seguir = true
	contador 9
		Jugador: fila y columna
		Si i % 2 != 0
			matriz[fila][columna] = "O"
		Sino
			matriz[fila][columna] = "X"
	contador que muestre todo
	fin contador
saber quien gana
	Int gana1 
	Int gana2
--> Quieres jugar? 1 Si , 2 No
Si res = 1
	seguir true
Sino 
	seguir false
Fin mientras

o _ _ 0,3,6
o _ _ 1,4,7
o _ _ 2,5,8

o o o 0-2
_ _ _ 3-5
_ _ _ 6-8

o _ _ 0,0) 1,4) 2,8)
_ o _ 2,0) 1,4) 0,2
_ _ o
 */
public class TresEnRaya {
	String[][] tablero = new String[3][3];
	Scanner teclado = new Scanner(System.in);

	public void juego() {
		boolean seguir = true;
		int filaJug = 0, columnaJug = 0, jug1Gana = 0, jug2Gana = 0, empate = 0;
		while (seguir) {
			//INICIALIZA TABLERO
			for (int fila = 0; fila < tablero.length; fila++) {
				for (int columna = 0; columna < tablero[fila].length; columna++) {
					tablero[fila][columna] = " ";
				}
			}
			// JUEGO
			for (int i = 0; i < 9; i++) {
				System.out.println("Fila:");
				filaJug = teclado.nextInt();
				System.out.println("Columna:");
				columnaJug = teclado.nextInt();
				if (i % 2 != 0) {
					tablero[filaJug][columnaJug] = "O";
				} else {
					tablero[filaJug][columnaJug] = "X";
				}
			}
			//MUESTRA TABLERO
			for (int fila = 0; fila < tablero.length; fila++) {
				for (int columna = 0; columna < tablero[fila].length; columna++) {
					System.out.println(tablero[fila][columna]);
				}
			}
			// QUIEN GANA
			if ((tablero[0][0] == "O" && tablero[3][0] == "O" && tablero[6][0] == "O")
					|| (tablero[1][1] == "O" && tablero[4][1] == "O" && tablero[7][1] == "O")
					|| (tablero[2][2] == "O" && tablero[5][2] == "O" && tablero[8][2] == "O")
					|| (tablero[0][0] == "O" && tablero[0][1] == "O" && tablero[0][2] == "O")
					|| (tablero[1][3] == "O" && tablero[1][4] == "O" && tablero[1][5] == "O")
					|| (tablero[6][2] == "O" && tablero[7][2] == "O" && tablero[8][2] == "O")
					|| (tablero[0][0] == "O" && tablero[1][4] == "O" && tablero[2][8] == "O")
					|| (tablero[2][0] == "O" && tablero[1][4] == "O" && tablero[0][2] == "O")) {
				jug1Gana++;
				System.out.println("jug1Gana");

			}
			
			else if ((tablero[0][0] == "X" && tablero[3][0] == "X" && tablero[6][0] == "X")
					|| (tablero[1][1] == "X" && tablero[4][1] == "X" && tablero[7][1] == "X")
					|| (tablero[2][2] == "X" && tablero[5][2] == "X" && tablero[8][2] == "X")
					|| (tablero[0][0] == "X" && tablero[0][1] == "X" && tablero[0][2] == "X")
					|| (tablero[1][3] == "X" && tablero[1][4] == "X" && tablero[1][5] == "X")
					|| (tablero[6][2] == "X" && tablero[7][2] == "X" && tablero[8][2] == "X")
					|| (tablero[0][0] == "X" && tablero[1][4] == "X" && tablero[2][8] == "X")
					|| (tablero[2][0] == "X" && tablero[1][4] == "X" && tablero[0][2] == "X")) {
				jug2Gana++;
				System.out.println("jug1Gana");
			}
			else {
				empate++;
				System.out.println("empate");
			}
		}
	}
}
