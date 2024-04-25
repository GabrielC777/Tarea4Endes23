/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);
        
        try {
            probarRetirar(objetoCuenta,333,"0");
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            probarIngresar(objetoCuenta,777,"0");
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    

    public static void probarIngresar(CCuenta c, int cantidad, String cantidadEsperada) throws Exception {
        c.ingresar(cantidad);
        System.out.println("La cantaida esperada es "+cantidadEsperada);

    }

    public static void probarRetirar(CCuenta c, int cantidad, String cantidadEsperada) throws Exception {
        c.retirar(cantidad);
        System.out.println("La cantaida esperada es "+cantidadEsperada);
    }
    
}
