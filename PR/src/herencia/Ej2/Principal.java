package herencia.Ej2;

import herencia.Ej2.Empleados;

public class Principal {
	public static void main(String[] args) {
		Empleados adm = new Administrativos();
		Empleados maq = new Maquinistas();
		adm.visualizarTodosDatos();
		maq.visualizarTodosDatos();
	}
}
