/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase se encuentra en el paquete "examenUT4"
 */
package examenUT4;

/**
 * <h2>Clase Main</h2>
 * @author Julio Santos Anés
 * @version 1.0
 * @since 08/03/2018
 */
public class Main {

	/**
	 * Metodo Main: metodo indispensable para ejecutar el programa
	 * @param args
	 */
    public static void main(String[] args) {
    	
    	/**
    	 * cuenta1: Objeto de tipo CCuenta
    	 */
        CCuenta cuenta1;
        
        /**
         * saldoActual; double que guarda el saldo actual
         */
        double saldoActual;

        
        /**
         * Inicializamos cuenta 1, de tipo CCuenta, y escribimos los diferentes atributos (nombre,cuenta,saldo,tipoInteres)
         */
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        /**
         * saldoActual es igual al metodo de mostrar el saldo, por lo que cada vez que llamemos a saldoActual
         * llamaremos al metodo estado(); y devolvera el saldo
         */
        saldoActual = cuenta1.estado();
        
        /**
         * Aqui se muestra el saldoActual en pantalla
         */
        System.out.println("El saldo actual es"+ saldoActual );

        /**
         * Llamamos al metodo anteriormente creado, pasandole el objeto de tipo CCuenta "cuenta1", y el parametro
         * tambien creado anteriomente "cantidad" con una cantidad de 1500
         */
        operativa_cuenta(cuenta1, 1500);
    } // Fin del metodo main

    /**
     * Metodo que llama a retirar e ingresar dinero
     * @param cuenta1
     * @param cantidad
     */
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
	
		
		/**
		 * Llama al metodo retirar, en la clase CCuenta, y retira 2300€, pero si capta una excepcion no se retiraria
		 * dinero y saldria un mensaje de fallo
		 */
		try {
            cuenta1.retirar(2300);
            //modificado
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
		
		/**
		 * Llama al metodo ingresar, en la clase CCuenta, e ingresa 695€, pero si capta una excepcion no se 
		 * ingresaria dinero y saldria un mensaje de fallo
		 */
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	} // Fin del metodo operativa_cuenta
} // Fin de la clase Main
