package herencia.Ej2.visibilidad1;

import herencia.Ej2.visibilidad2.EmpleadoEspecial;

public class Principal {
	public static void main(String[] args) {
		// 1
		//Empleado emp = new Jefe();
		
		// 2
		EmpleadoEspecial empEspe = new JefeEspecial();
	}
}
