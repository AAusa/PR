package vector.Ej10;

import java.util.Scanner;

/**
 * Clase: Ej11
 * @author alu Matriz 3x3
 * 
 *         Matriz 3x3
 */
public class TresEnRaya {
	String[][] tablero = new String[3][3];
	Scanner teclado = new Scanner(System.in);

	/**
	 *  Metodo:
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
	public void juego() {
		int seguir = 1;
		boolean seguirJug = true;
		int filaJug = 0, columnaJug = 0, jug1Gana = 0, jug2Gana = 0, empate = 0;
		while (seguir == 1) {
			//INICIALIZA TABLERO
			for (int fila = 0; fila < tablero.length; fila++) {
				for (int columna = 0; columna < tablero[fila].length; columna++) {
					tablero[fila][columna] = "_";
				}
			}
			seguirJug = true;
			// JUEGO
			for (int i = 1; i <= 9 && seguirJug; i++) {
				System.out.println("Fila (0, 1 o 2):");
				filaJug = teclado.nextInt();
				System.out.println("Columna (0, 1 o 2):");
				columnaJug = teclado.nextInt();
				if (i % 2 != 0) {
					if(tablero[filaJug][columnaJug].equals("_")) {
						tablero[filaJug][columnaJug] = "O";
					}
					else {
						i--;
						System.out.println("Error");
					}
				} 
				else {
					if(tablero[filaJug][columnaJug].equals("_")) {
						tablero[filaJug][columnaJug] = "X";
					}
					else {
						i--;
						System.out.println("Error");
					}
				}
				//MUESTRA TABLERO
				for (int fila = 0; fila < tablero.length; fila++) {
					
					for (int columna = 0; columna < tablero.length; columna++) {
						System.out.print(tablero[fila][columna]);
						if(columna == 2 && columna != 5) {
							System.out.println();
						}
					}	
				}
				// QUIEN GANA
				if ((tablero[0][0] == "O" && tablero[1][0] == "O" && tablero[2][0] == "O")
						|| (tablero[0][1] == "O" && tablero[1][1] == "O" && tablero[2][1] == "O")
						|| (tablero[0][2] == "O" && tablero[1][2] == "O" && tablero[2][2] == "O")
						|| (tablero[0][0] == "O" && tablero[0][1] == "O" && tablero[0][2] == "O")
						|| (tablero[1][0] == "O" && tablero[1][1] == "O" && tablero[1][2] == "O")
						|| (tablero[2][0] == "O" && tablero[2][1] == "O" && tablero[2][2] == "O")
						|| (tablero[0][0] == "O" && tablero[1][1] == "O" && tablero[2][2] == "O")
						|| (tablero[0][2] == "O" && tablero[1][1] == "O" && tablero[2][2] == "O")) {
					jug1Gana++;
					System.out.println("jug1Gana");
					seguirJug = false;

				}
				
				else if ((tablero[0][0] == "X" && tablero[1][0] == "X" && tablero[2][0] == "X")
						|| (tablero[0][1] == "X" && tablero[1][1] == "X" && tablero[2][1] == "X")
						|| (tablero[0][2] == "X" && tablero[1][2] == "X" && tablero[2][2] == "X")
						|| (tablero[0][0] == "X" && tablero[0][1] == "X" && tablero[0][2] == "X")
						|| (tablero[1][0] == "X" && tablero[1][1] == "X" && tablero[1][2] == "X")
						|| (tablero[2][0] == "X" && tablero[2][1] == "X" && tablero[2][2] == "X")
						|| (tablero[0][0] == "X" && tablero[1][1] == "X" && tablero[2][2] == "X")
						|| (tablero[0][2] == "X" && tablero[1][1] == "X" && tablero[2][2] == "X")) {
					jug2Gana++;
					System.out.println("jug1Gana");
					seguirJug = false;
				}
				else {
					if(((tablero[0][0] != "_" && tablero[1][0] != "_" && tablero[2][0] != "_")
							&& (tablero[0][1] != "_" && tablero[1][1] != "_" && tablero[2][1] != "_")
							&& (tablero[0][2] != "_" && tablero[1][2] != "_" && tablero[2][2] != "_"))) {
						empate++;
						System.out.println("empate");
						seguirJug = false;
					}
				}
			}
			System.out.println("¿Quieres seguir jugando? 1 --> Si, 2 --> No");
			seguir = teclado.nextInt();
		}
		System.out.println("jug1Gana: "+jug1Gana);
		System.out.println("jug2Gana: "+jug2Gana);
		System.out.println("Empate: "+empate);
	}
	public static void main(String[] args) {
		TresEnRaya juego = new TresEnRaya();
		juego.juego();
	}
}
