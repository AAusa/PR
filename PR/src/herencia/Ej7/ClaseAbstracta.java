package herencia.Ej7;

public abstract class ClaseAbstracta {
	
	public int prueba;
	int prueba2;
	private int prueba3;
	protected int prueba4;
	//Deja: public, protected 
	public abstract int ejemplo();
	//Deja: public, private, protected, package
	void ejemplo2() {
		
	}
	public ClaseAbstracta() {
		System.out.println("Clase abstracta");
	}
	public abstract int ejemplo3();
}
