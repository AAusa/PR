package ClasesObjetos2.Ej3;

/**
 * @author �lvaro
 * @params nId, nombre, estadoCivil, turno, titulacion, antiguedad, n�mina
 */
public class Trabajador {
	private int nId;
	static private int contador;
	private String nombre;
	private char estadoCivil;
	private char turno;
	private int titulacion;
	private int antiguedad;
	private int nomina;
	private boolean verificacion;
	
	public boolean isVerificacion() {
		return verificacion;
	}

	public void setVerificacion(boolean verificacion) {
		if((estadoCivil == 'C' || estadoCivil == 'S') && (turno == 'N' || turno == 'D') && (titulacion == 0 || titulacion == 1 || titulacion == 2 || titulacion == 3|| titulacion == 4)) {
			this.verificacion = true;
		}
		else {
			this.verificacion = false;
		}
	}

	public int getnId() {
		return nId;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public char getTurno() {
		return turno;
	}
	public void setTurno(char turno) {
		this.turno = turno;
	}
	public int getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(int titulacion) {
		this.titulacion = titulacion;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public int nomina(char estadoCivil, char turno, int titulacion, int antiguedad) {
		setVerificacion(verificacion);
		if(verificacion == true) {
			nomina = 425;
			if(turno == 'N') {
				turno += 100;
			}
			nomina += 75 * antiguedad;
			switch(titulacion) {
			case 0:
				nomina += 250; break;
			case 1:
				nomina += 500; break;
			case 2:
				nomina += 1000; break;
			case 3:
				nomina += 1250; break;
			case 4:
				nomina += 1500; break;
			}
			
			if(estadoCivil == 'C') {
				nomina -= nomina * 0.10;
			}
			else {
				if(estadoCivil == 'S') {
					nomina -= nomina * 0.12;
				}
			}
		}
			else {
				nomina = 0;
			}
		return nomina;
		}
		
	public String verDatos() {
		String mensaje="";
		if(nomina != 0) {
			// Creaci�n mensaje completo en estado civil y turno:
			String mensajeEstadoCivil="";
			if(estadoCivil == 'C') {
				mensajeEstadoCivil = "casado";
			}
			else {	
				if(estadoCivil == 'S') {
					mensajeEstadoCivil = "soltero";
				}
			}
			
			String mensajeTurno="";
			if(turno == 'D') {
				mensajeTurno = "d�a";
			}
			else {	
				if(turno == 'N') {
					mensajeTurno = "noche";
				}
			}
			mensaje = "El numId es "+nId+", el nombre es "+nombre+", el estado civil es "+mensajeEstadoCivil+", el turno es "+mensajeTurno+", la titulaci�n es "+titulacion+", la antiguedad son "+antiguedad+ " a�os. La n�mina son "+nomina+" �";
		}
		else {
			System.out.println("Hay m�nimo un par�metro ERR�NEO");
		}


		return mensaje;
	}
	
	public Trabajador() {
		if(contador < 101) {
			nId = ++contador;
		}
		this.nombre = "";
		this.estadoCivil = 0;
		this.turno = 0;
		this.titulacion = 0;
		this.antiguedad = 0;
	}
	public Trabajador(String nombre, char estadoCivil, char turno, int titulacion, int antiguedad) {
		this();
		this.nombre = nombre;
		this.estadoCivil = estadoCivil;
		this.turno = turno;
		this.titulacion = titulacion;
		this.antiguedad = antiguedad;
	}
}
