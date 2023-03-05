package cuentasBanco;



/**
 * Esta clase simula el comportamiento de un cajero. Ingresar dinero y retirar dinero son sus funciones.
 * @author Gabriel Martinez Vitaller
 * @version 1.0
 * @since 1.0
 * 
 */
public class CuentaBanco {

/**
 * Atributos de la clase cuentaBanco
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Metodo para reutilizacion de codigo
     */
    public CuentaBanco()
    {
    }

    
    /** Metodo para modificar parametros 
     * @param nom modifica el nombre	
     * @param cue modifica la cuenta	
     * @param sal modifica el saldo
     * @param tipo modifica el tipo de interes
     */
    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /** Metodo que muestra el saldo de la cuenta
     * @return el saldo de la cuenta
     */
    
    public double estado()
    {
        return getSaldo();
    }

    /** Metodo para ingresar dinero
     * @param cantidad Introduce la cantidad de dinero a ingresar
     * @throws Exception 	Muestra las excepciones del ingreso
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    
    /** Metodo para retirar dinero
     * @param cantidad Muestra la cantidad de dinero a retirar
     * @throws Exception Muestra por pantalla las excepciones de la retirada de dinero
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    
	/** Metodo para devolver el saldo de la cuenta
	 * @return saldo de la cuenta
	 **/
    
	private double getSaldo() {
		return saldo;
	}

	/** Metodo para modoificar el saldo de la cuenta
	 * @param saldo se va a definir para la cuenta
	 **/
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return el nombre la cuente
	 */
	private String getNombre() {
		return nombre;
	}

	/**Metodo para modificar el nombre de la cuenta
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el tipo de interes
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/** Método para modificar el tipo de interes
	 * @param tipoInterés
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
