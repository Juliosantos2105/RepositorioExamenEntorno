/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Esta clase se encuentra en el paquete "examenUT4"
 */
package examenUT4;

/**
 * <h2>Clase CCuenta</h2>
 * @author Julio Santos Anés
 * @version 1.0
 * @since 08/03/2018
 */
public class CCuenta {


	/**
	 * nombre: guarda el nombre de la cuenta
	 */
    protected String nombre;
    /**
     * cuenta: guarda el tipo de cuenta
     */
    protected String cuenta;
    /**
     * saldo: guarda el saldo inicial, posteriormente se puede ingresar o retirar dinero
     */
    protected double saldo;
    /**
     * tipoInterés: guarda el tipo de interes de la cuenta
     */
    protected double tipoInterés;


    /**
     * Este es el constructor sin parametros
     */
    public CCuenta()
    {
    } // Fin del constructor sin parametros

    /**
     * Este es el constructor con parametros
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    } // Fin del constructor con parametros

    /**
     * Este metodo llama al metodo setNombre(), pasandole el atributo nombre
     * @param nom
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    } // Fin del metodo asignarNombre

    /**
     * Este metodo llama al metodo getNombre() que este retorna el nombre de la cuenta
     * @return
     */
    public String obtenerNombre()
    {
        return getNombre();
    } // Fin del metodo obtener nombre


    /**
     * Este metodo muestra el saldo que tenemos
     * @return
     */
    public double estado()
    {
        return saldo;
    } // Fin del metodo estado


    /**
     * Este metodo ingresa dinero, se le pasa una cantidad que el usuario pide, si es negativo no se puede realizar
     * la operacion
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    } // Fin del metodo ingresar

    /**
     * Este metodo retira dinero al saldo
     * se le pasa una cantidad que el usuario pide, si es negativo no se puede realizar la operacion
     * Si la cantidad a retirar es mayor que el saldo, tambien daria un fallo, ya que no hay suficiente dinero 
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    } // Fin del metodo retirar


    /**
     * Este metodo devuelve la cuenta elegida
     * @return
     */
    public String obtenerCuenta()
    {
        return cuenta;
    } // FIn del metodo obtenerCUenta


    /**
     * Este metodo devuelve el nombre de la cuenta
     * @return
     */
    public String getNombre() {
        return nombre;
    } // Fin del metodo getNombre


    /**
     * Este metodo asigna un nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // Fin del metodo setNombre


    /**
     * Este metodo devuelve el tipo de interes
     * @return
     */
    public double getTipoInterés() {
        return tipoInterés;
    } // Fin del metodo getTipoInteres


    /**
     * Este metodo introduce el tipo de interes
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    } // Fin del metodo setTipoInteres
} // Fin de la clase CCuenta
