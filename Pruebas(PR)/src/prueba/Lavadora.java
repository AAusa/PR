package prueba;

/**
 * Clase Lavadora
 *
 * Contiene informacion de lavador
 *
 * @author Fernando
 * @version 1.0
 */
public class Lavadora extends Electrodomestico{
  
    //Constantes
  
    /**
     * Carga por defecto
     */
    private final static int CARGA_DEF=5;
  
    //Atributos
  
    /**
     * Carga de la lavadora
     */
    private int carga;
  
    //M�todos publicos
  
    /**
     * Devuelve la carga de la lavadora
     * @return
     */
    public int getCarga() {
        return carga;
    }
  
    /**
     * Precio final de la lavadora
     * @return precio final de la lavadora
     */
    public double precioFinal(){
        //Invocamos el m�todo precioFinal del m�todo padre
        double plus=super.precioFinal();
  
        //a�adimos el c�digo necesario
        if (carga>30){
            plus+=50;
        }
  
        return plus;
    }
  
    //Constructor
  
    /**
     * Contructor por defecto
     */
    public Lavadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
    /**
     * Constructor con 5 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}
